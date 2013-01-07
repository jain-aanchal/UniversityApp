package com.university.network.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.university.network.dao.NetworkDao;
import com.university.network.domain.University;
import com.university.network.repository.UniversityRepository;


@Repository
public class UniversityRepositoryImpl implements UniversityRepository {

	@Autowired
	private NetworkDao networkDao ;
	
	@Override
	public University findbyName(String name) {
		
		return networkDao.findUniversityByName(name) ;
	}

}
