package com.university.network.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name = "university")
public class University 
{
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
	private Integer Id;
    
	@Column(name = "Name")
	private String universityName ;

	public String getUniversityName() {
		return universityName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

}
