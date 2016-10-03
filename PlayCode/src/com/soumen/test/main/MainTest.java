package com.soumen.test.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soumen.student.personal.StudentPersonal;

public class MainTest {

	public static void main(String[] args) {
		
		StudentPersonal studentPersonal = new StudentPersonal();
		studentPersonal.setName("soumen");
		studentPersonal.setPhoneNumber("8123498216");
		studentPersonal.setGender("M");
		studentPersonal.setDateOfBirth(new Date());
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(studentPersonal);
		t.commit();
		s.close();
		sf.close();
	}

}
