package thangtranit.com.dxtmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thangtranit.com.dxtmoney.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
