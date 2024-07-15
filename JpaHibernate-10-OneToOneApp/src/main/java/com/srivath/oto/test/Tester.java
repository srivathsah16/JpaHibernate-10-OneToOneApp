package com.srivath.oto.test;

import com.srivath.oto.dao.PersonDao;
import com.srivath.oto.dao.impl.PersonDaoImpl;
import com.srivath.oto.entities.Person;

public class Tester {
	public static void main(String[] args) {
		PersonDao dao = new PersonDaoImpl();

		/*
		 * call savePerson()
		 */
//		Person person=new Person();
//		person.setPersonId(101);
//		person.setPersonName("John");
//		Passport passport=new Passport();
//		passport.setPassportId(2321);
//		LocalDate expDate=LocalDate.of(2025, 4, 12);
//		passport.setExpiryDate(expDate);
//		person.setPassport(passport);
//		
//		Person person1=new Person();
//		person1.setPersonId(102);
//		person1.setPersonName("Cassy");
//		Passport passport1=new Passport();
//		passport1.setPassportId(6555);
//		LocalDate expDate1=LocalDate.of(2027, 8, 17);
//		passport1.setExpiryDate(expDate1);
//		person1.setPassport(passport1);
//
//		
//		dao.savePerson(person1);

		/*
		 * call findPerson()
		 */

//		Person personFromDb = dao.findPerson(101);
//		System.out.println("id : " + personFromDb.getPersonId() + "\nName : " + personFromDb.getPersonName()
//				+ "\nPassport id : " + personFromDb.getPassport().getPassportId() + "\nPassport expiry date : "
//				+ personFromDb.getPassport().getExpiryDate());
		
		/*
		 * call deletePerson()
		 */
		
//		dao.deletePerson(101);
	}

}
