package com.university.network.domain;
import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class University extends AbstractPersistable<Integer> 
{
	private static final long serialVersionUID = 1L;
	private String universityName ;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

}
