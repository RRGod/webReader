package com.nextinnovation.webreader.dao.impl;

import com.nextinnovation.webreader.dao.GenericDao;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;


public class GenericDaoImpl<T,ID extends Serializable> extends HibernateDaoSupport implements GenericDao<T, ID> {

	public void save(Object domain) {
		super.getHibernateTemplate().save(domain);
	}

	public void delete(Object domain) {
		super.getHibernateTemplate().delete(domain);
	}

	public void update(Object domain) {
		super.getHibernateTemplate().update(domain);
	}

	public T findById(Class<T> domainClass, ID id) {
		return super.getHibernateTemplate().get(domainClass, id);
	}

	public List<T> findAll(Class<T> domainClass) {
		return super.getHibernateTemplate().loadAll(domainClass);
	}

	public List<T> findByNamedQuery(String queryName, Object... values) {
		return super.getHibernateTemplate().findByNamedQuery(queryName,values);
	}

	public List<T> findByCriteria(DetachedCriteria criteria) {
		return super.getHibernateTemplate().findByCriteria(criteria);
	}

}
