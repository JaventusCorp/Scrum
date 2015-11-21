package br.com.lab6.scrum.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lab6.scrum.dao.interfaces.InterfaceDAO;

/**
*
* @author Hideki
*/
public class GenericDAO<T> implements InterfaceDAO<T>, Serializable{

	private static final long serialVersionUID = 562907781510167068L;
	@PersistenceContext
	protected EntityManager em;
	private Class<T> type;
	
	public GenericDAO() {
	}
	
    public GenericDAO(Class<T> type) {
        this.type = type;
    }

	@Override
	public void save(T entity) {
        try{
            em.persist(entity);
        }catch (Exception e){
            throw e;
        }
    }

	@Override
	public T find(Object id) {
		return (T) em.find(this.type, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> list() {
		return em.createQuery(
                "select t from " + this.type.getSimpleName() + " t ")
                .getResultList();
	}

	@Override
	public void remove(T entity) {
		try {
            T merge = em.merge(entity);
            em.remove(merge);
        } catch (Exception e) {
            throw e;
        }
	}

	@Override
	public T update(T entity) {
		try {
            entity = em.merge(entity);
        } catch (Exception e) {
            throw e;
        }
        return entity;
	}

}
