package thangtranit.com.dxtmoney.services.itf;

import java.util.List;
import java.util.Optional;

public interface ServiceItf<E> {
    List<E> getAll();
    Optional<E> getById(int id);
    void create(E newElement);
    void update(E newData);
    void delete(int id);
}
