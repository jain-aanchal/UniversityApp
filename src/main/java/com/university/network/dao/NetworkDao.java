package com.university.network.dao;

import java.util.List;

import com.university.network.domain.TopId;
import com.university.network.domain.University;

public interface NetworkDao {

	///public String getConnectionUrl();
	void create(TopId obj);
	void update(TopId obj);
	void delete(TopId obj);
//	<T extends TopId> T find(Class<T> obj, int id);
//	<T> T find(Class<T> obj, Object ... params);
	<T> List<T> findAll(Class<T> clazz);
//	<T> List<T> findNative(String query, Object ... params);
	TopId findById(Integer id);
	University findUniversityByName(String name) ;
	
}
