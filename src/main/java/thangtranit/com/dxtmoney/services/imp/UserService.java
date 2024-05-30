package thangtranit.com.dxtmoney.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import thangtranit.com.dxtmoney.model.User;
import thangtranit.com.dxtmoney.repository.UserRepository;
import thangtranit.com.dxtmoney.services.itf.ServiceItf;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements ServiceItf<User> {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public void create(User newElement) {
        repository.save(newElement);
    }

    @Override
    public void update(User newData) {
        repository.save(newData);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
