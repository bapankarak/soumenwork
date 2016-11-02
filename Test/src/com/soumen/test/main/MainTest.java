package com.soumen.test.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soumen.area.address.AddressType;
import com.soumen.area.address.District;
import com.soumen.area.address.PoliceStation;
import com.soumen.area.address.PostOffice;
import com.soumen.area.address.Village;
import com.soumen.student.personal.StudentAddress;
import com.soumen.student.personal.StudentPersonal;

public class MainTest {

	public static void main(String[] args) {
		final StudentPersonal studentPersonal = new StudentPersonal();
		studentPersonal.setFirstName("soumen");
		studentPersonal.setLastName("karak");
		studentPersonal.setPhoneNumber("8123498219");
		studentPersonal.setGender("M");
		studentPersonal.setDateOfBirth(new Date());

		final Village village = new Village();
				village.setName("kiamacha");
		final PostOffice postOffice = new PostOffice();
		postOffice.setName("kiamacha");
		final PoliceStation policeStation = new PoliceStation();
		policeStation.setName("golatore");
		final District district = new District();
		district.setName("medinipur");
		final AddressType addressType = null;

		final StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddressType(addressType);
		studentAddress.setDistrict(district);
		studentAddress.setPinNumber("721253");
		studentAddress.setPoliceStation(policeStation);
		studentAddress.setPostOffice(postOffice);
		studentAddress.setVillage(village);

		studentAddress.setStudentPersonal(studentPersonal);

		// studentPersonal.setStudentAddress(studentAddress);

		final SessionFactory sf = new Configuration().configure().buildSessionFactory();
		final Session s = sf.openSession();
		final Transaction t = s.beginTransaction();
		s.save(studentPersonal);
		s.save(studentAddress);
		t.commit();
		s.close();
		sf.close();
		System.out.println("soumen");
	}

}
