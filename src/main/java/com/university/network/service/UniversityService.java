package com.university.network.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.network.domain.University;
import com.university.network.repository.UniversityRepository.UniversityRepository;

@Service
public class UniversityService {

	private static final Logger logger = LoggerFactory.getLogger(UniversityService.class) ;
	
	@Autowired
	private UniversityRepository universityRepository ;
	
	public Iterable<University> findAll() {
	    return universityRepository.findAll();
	  }
	
	private Map<Integer,String> universityMap;
	 
//	public Map<Integer,String> findAll(){
//		logger.info("Retriving all the universities ") ;
//		if(universityMap == null){
//			populate() ;
//		}
//		return universityMap ;
//	}
	
//	 private void populate() {
//		 universityMap = new HashMap<Integer,String>() ;
//		 universityMap.put(1,"University of Texas");
//		 universityMap.put(2,"Stanford University");
//		 universityMap.put(3,"Michigan Univerisity");
//		 universityMap.put(4,"University of San Francisco");
//	    }
	
}
