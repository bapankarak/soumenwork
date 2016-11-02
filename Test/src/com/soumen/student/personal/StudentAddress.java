package com.soumen.student.personal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.soumen.area.address.AddressType;
import com.soumen.area.address.District;
import com.soumen.area.address.PoliceStation;
import com.soumen.area.address.PostOffice;
import com.soumen.area.address.Village;

@Entity
@Table(name = "S_STUDENT_ADDRESS")
public class StudentAddress {

	public StudentAddress() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="villageId")
	private Village village;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="postOfficeId")
	private PostOffice postOffice;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="policeStationId")
	private PoliceStation policeStation;

	@ManyToOne(cascade = CascadeType.ALL,targetEntity=District.class)
	@JoinColumn(name="districtId")
	private District district;

	private String pinNumber;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private AddressType addressType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private StudentPersonal studentPersonal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public PostOffice getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(PostOffice postOffice) {
		this.postOffice = postOffice;
	}

	public PoliceStation getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(PoliceStation policeStation) {
		this.policeStation = policeStation;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public StudentPersonal getStudentPersonal() {
		return studentPersonal;
	}

	public void setStudentPersonal(StudentPersonal studentPersonal) {
		this.studentPersonal = studentPersonal;
	}



}
