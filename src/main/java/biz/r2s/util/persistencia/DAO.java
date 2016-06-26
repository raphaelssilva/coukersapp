package biz.r2s.util.persistencia;

import java.util.List;

public interface DAO<T> {
 
	public T create(T object);
	public T edit(T object);
	public void delete(T key);
	public List<T> findAll();
	public T find(Long id);
	public List<T> findBy(String filtro);
}
 
