package com.soumen.student.personal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "S_STUDENT_ADDRESS")
public class StudentAddress {

	public StudentAddress() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	private String village;
	private String postOffice;
	private String policeStation;
	private String district;
	private String pinNumber;
	private String addressType;
	/*
	 * @GeneratedValue(generator = "ref")
	 *
	 * @GenericGenerator(name = "ref", strategy = "foreign", parameters = {
	 *
	 * @Parameter(value = "studentPersonal", name = "property") }) private int
	 * studentId;
	 */

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private StudentPersonal studentPersonal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public StudentPersonal getStudentPersonal() {
		return studentPersonal;
	}

	public void setStudentPersonal(StudentPersonal studentPersonal) {
		this.studentPersonal = studentPersonal;
	}

}
