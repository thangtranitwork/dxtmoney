package thangtranit.com.dxtmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thangtranit.com.dxtmoney.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
