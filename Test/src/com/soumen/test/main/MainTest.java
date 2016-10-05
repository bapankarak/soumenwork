package com.soumen.test.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soumen.student.personal.StudentAddress;
import com.soumen.student.personal.StudentPersonal;

public class MainTest {

	public static void main(String[] args) {

		StudentPersonal studentPersonal = new StudentPersonal();
		studentPersonal.setFirstName("soumen");
		studentPersonal.setLastName("karak");
		studentPersonal.setPhoneNumber("8123498216");
		studentPersonal.setGender("M");
		studentPersonal.setDateOfBirth(new Date());

		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddressType("permanent");
		studentAddress.setDistrict("medinipur");
		studentAddress.setPinNumber("721253");
		studentAddress.setPoliceStation("goaltore");
		studentAddress.setPostOffice("kiamacha");
		studentAddress.setVillage("kiamacha");

		studentAddress.setStudentPersonal(studentPersonal);

		// studentPersonal.setStudentAddress(studentAddress);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(studentPersonal);
		s.save(studentAddress);
		t.commit();
		s.close();
		sf.close();
	}

}
