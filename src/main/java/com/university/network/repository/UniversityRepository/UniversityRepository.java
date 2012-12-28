package com.university.network.repository.UniversityRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.university.network.domain.University;

public interface UniversityRepository extends JpaRepository<University, Integer> 
{

}
