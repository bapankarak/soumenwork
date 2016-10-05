package com.soumen.student.personal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone", unique = true)
	private String phoneNumber;

	/*
	 * @GeneratedValue(generator = "ref")
	 *
	 * @GenericGenerator(name = "ref", strategy = "foreign", parameters = {
	 *
	 * @Parameter(value = "studentAddress", name = "property") }) private int
	 * addressId;
	 *
	 * @OneToOne(cascade = CascadeType.ALL)
	 *
	 * @JoinColumn(name = "ID") private StudentAddress studentAddress;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
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