package com.soumen.student.personal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "S_STUDENT_PARENTS")
public class StudentParents {

	public StudentParents() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name = "ID")	
	private int id;
	
	private String fatherName;
	private String motherName;
	private String grandFatherName;
	private String grandMotherName;
	
	@Column(unique = true)
	private String fatherPhoneNumber;
	@Column(unique = true)
	private String motherPhoneNumber;
	private String fatherOccupation;
	private String motherOccupation;
	private String fatherMonthlyIncome;
	private String motherMonthlyIncome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGrandFatherName() {
		return grandFatherName;
	}
	public void setGrandFatherName(String grandFatherName) {
		this.grandFatherName = grandFatherName;
	}
	public String getGrandMotherName() {
		return grandMotherName;
	}
	public void setGrandMotherName(String grandMotherName) {
		this.grandMotherName = grandMotherName;
	}
	public String getFatherPhoneNumber() {
		return fatherPhoneNumber;
	}
	public void setFatherPhoneNumber(String fatherPhoneNumber) {
		this.fatherPhoneNumber = fatherPhoneNumber;
	}
	public String getMotherPhoneNumber() {
		return motherPhoneNumber;
	}
	public void setMotherPhoneNumber(String motherPhoneNumber) {
		this.motherPhoneNumber = motherPhoneNumber;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getFatherMonthlyIncome() {
		return fatherMonthlyIncome;
	}
	public void setFatherMonthlyIncome(String fatherMonthlyIncome) {
		this.fatherMonthlyIncome = fatherMonthlyIncome;
	}
	public String getMotherMonthlyIncome() {
		return motherMonthlyIncome;
	}
	public void setMotherMonthlyIncome(String motherMonthlyIncome) {
		this.motherMonthlyIncome = motherMonthlyIncome;
	}
	
	

}
