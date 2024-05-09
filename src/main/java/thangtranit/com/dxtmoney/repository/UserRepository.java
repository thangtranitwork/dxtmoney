package thangtranit.com.dxtmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thangtranit.com.dxtmoney.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
