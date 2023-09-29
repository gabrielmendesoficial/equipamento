package br.com.fiap.domain.repository;
import java.util.List;
public interface Repository<T, U> {
    public T persist(T t);
    public List<T> findAll();
    public T findById(U u);
    public T update(T t);
    public boolean delete(U id);
}
