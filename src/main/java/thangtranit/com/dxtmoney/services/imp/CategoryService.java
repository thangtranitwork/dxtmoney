package thangtranit.com.dxtmoney.services.imp;

import org.springframework.stereotype.Service;
import thangtranit.com.dxtmoney.model.Category;
import thangtranit.com.dxtmoney.model.Category;
import thangtranit.com.dxtmoney.repository.CategoryRepository;
import thangtranit.com.dxtmoney.services.itf.ServiceItf;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ServiceItf<Category> {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Category> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public void create(Category newElement) {
        repository.save(newElement);
    }

    @Override
    public void update(Category newData) {
        repository.save(newData);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
