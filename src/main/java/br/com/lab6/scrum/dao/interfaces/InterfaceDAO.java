package br.com.lab6.scrum.dao.interfaces;

import java.util.List;

/**
*
* @author Hideki
*/
public interface InterfaceDAO<T> {
	public void save(T entity);
    public T find(Object id);
    public List<T> list();
    public void remove(T entity);
    public T update(T entity);
}
