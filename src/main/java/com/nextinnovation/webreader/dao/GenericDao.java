package com.nextinnovation.webreader.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <T,ID extends Serializable>{
	void save(Object domain);
	void delete(Object domain);
	void update(Object domain);
	
	T findById(Class<T> domainClass, ID id);
	List<T> findAll(Class<T> domainClass);
	List<T> findByNamedQuery(String queryName, Object... values);
	List<T> findByCriteria(DetachedCriteria criteria);
}
