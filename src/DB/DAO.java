package DB;

import java.util.List;

/**
 * Created by Александр on 30.05.2016.
 */
public interface DAO<T> {
    boolean create(T product);

    List<T> findAll();

    T findById(int id);

    void update(T product);

    void delete(T product);
}
