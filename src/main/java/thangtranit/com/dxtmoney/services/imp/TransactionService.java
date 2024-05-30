package thangtranit.com.dxtmoney.services.imp;


import org.springframework.stereotype.Service;
import thangtranit.com.dxtmoney.model.Transaction;
import thangtranit.com.dxtmoney.repository.TransactionRepository;
import thangtranit.com.dxtmoney.services.itf.ServiceItf;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ServiceItf<Transaction> {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Transaction> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Transaction> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public void create(Transaction newElement) {
        repository.save(newElement);
    }

    @Override
    public void update(Transaction newData) {
        repository.save(newData);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}

