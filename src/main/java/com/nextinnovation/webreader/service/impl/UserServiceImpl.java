package com.nextinnovation.webreader.service.impl;

import com.nextinnovation.webreader.dao.GenericDao;
import com.nextinnovation.webreader.entity.User;
import com.nextinnovation.webreader.service.UserService;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class UserServiceImpl implements UserService {

	private GenericDao<User,String> genericDao;
	public void setGenericDao(GenericDao<User, String> genericDao) {
		this.genericDao = genericDao;
	}





	public User login(User user) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		
		criteria.add(Restrictions.eq("username", user.getUsername()))
				.add(Restrictions.eq("password", user.getPassword()));
		List<User> list = genericDao.findByCriteria(criteria);
		return list.isEmpty()?null:list.get(0);
	}

}
