package thangtranit.com.dxtmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thangtranit.com.dxtmoney.model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}
