package com.university.network.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.university.network.dao.NetworkDao;
import com.university.network.domain.TopId;
import com.university.network.domain.University;

public class NetworkDaoImpl extends HibernateDaoSupport implements NetworkDao{

	@Override
	public void create(TopId obj) {
		getHibernateTemplate().save(obj);
		
	}

	@Override
	public void update(TopId obj) {
		getHibernateTemplate().update(obj);
		
	}

	@Override
	public void delete(TopId obj) {
		getHibernateTemplate().delete(obj);
		
	}

	@Override
	public <T> List<T> findAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopId findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public University findUniversityByName(String name) {
		List list = getHibernateTemplate().find(
                "from University where name=?",name
           );
		if(list != null){
			return (University)list.get(0);
		}
		return null ;
	}


}
