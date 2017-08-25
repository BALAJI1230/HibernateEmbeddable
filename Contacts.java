package org.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Contact_table")
@Table(name="Contact_table")
public class Contact {
    @Id
    @Column(name="Contact_Id",length=50,unique=true,nullable=true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Basic
    private String firstName;
    @Column(name="last_name",length=50,unique=true,nullable=true)
    private String lastName;
    @Column(name="email_Id",length=50,unique=true,nullable=false)
    private String emailId;
    @Column(name="Phone_Number",length=50,unique=true,nullable=false)
    private Long phoneNo;
    @Column(name="Date_of_Birth",length=50,unique=true,nullable=true)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String photo;
    @Embedded
    private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Contact() {
		super();
	}
    
    
	
}
