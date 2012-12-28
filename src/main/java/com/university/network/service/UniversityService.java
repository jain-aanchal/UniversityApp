package com.university.network.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

	private static final Logger logger = LoggerFactory.getLogger(UniversityService.class) ;
	
	private Map<Integer,String> universityMap;
	 
	public Map<Integer,String> findAll(){
		logger.info("Retriving all the universities ") ;
		if(universityMap == null){
			populate() ;
		}
		return universityMap ;
	}
	
	 private void populate() {
		 universityMap = new HashMap<Integer,String>() ;
		 universityMap.put(1,"University of Texas");
		 universityMap.put(2,"Stanford University");
		 universityMap.put(3,"Michigan Univerisity");
		 universityMap.put(4,"University of San Francisco");
	    }
	
}
