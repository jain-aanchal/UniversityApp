package com.university.network.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.network.domain.University;
import com.university.network.repository.UniversityRepository;

@Service
public class UniversityService {

	private static final Logger logger = LoggerFactory.getLogger(UniversityService.class) ;
	
	@Autowired
	private UniversityRepository universityRepository ;
	
//	public Iterable<University> findAll() {
//	    return universityRepository.findAll();
//	  }

	public University findUniversityByName(String name) {
		return universityRepository.findbyName(name);
	}
	private Map<Integer,String> universityMap;
	 
}
