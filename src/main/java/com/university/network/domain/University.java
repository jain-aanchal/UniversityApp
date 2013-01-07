package com.university.network.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name = "university")
public class University implements TopId
{
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
    
	@Column(name = "name")
	private String universityName ;

	@Column(name = "address1")
	private String addressLine1 ; 
	
	@Column(name = "address2")
	private String addressLine2 ;
	
	@Column(name = "addressNum")
	private Integer addNumber ;
	
	@Column(name = "state")
	private String state ;
	
	@Column(name = "city")
	private String city ;
	
	@Column(name = "country")
	private String country ;
	
	@Column(name = "zipcode")
	private String zipcode ;
	
	
	public String getUniversityName() {
		return universityName;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Integer getAddNumber() {
		return addNumber;
	}

	public void setAddNumber(Integer addNumber) {
		this.addNumber = addNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String findAddress() {
		return addNumber + " " + addressLine1 +", "+ city + ", " + state + "-" +  zipcode + " " + country   ;
	}
	
	

}
