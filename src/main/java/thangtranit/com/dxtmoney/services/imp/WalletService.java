package thangtranit.com.dxtmoney.services.imp;


import org.springframework.stereotype.Service;
import thangtranit.com.dxtmoney.model.Wallet;
import thangtranit.com.dxtmoney.repository.WalletRepository;
import thangtranit.com.dxtmoney.services.itf.ServiceItf;

import java.util.List;
import java.util.Optional;

@Service
public class WalletService implements ServiceItf<Wallet> {

    private final WalletRepository repository;

    public WalletService(WalletRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Wallet> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Wallet> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public void create(Wallet newElement) {
        repository.save(newElement);
    }

    @Override
    public void update(Wallet newData) {
        repository.save(newData);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
