package com.soumen.student.personal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

@Entity
@Table(name = "S_STUDENT_PERSONAL")
public class StudentPersonal {
	
	public StudentPersonal() {
		Logger log = Logger.getLogger(StudentPersonal.class);
	}
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name ="name")
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name ="phone", unique=true)
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
