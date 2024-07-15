package com.srivath.oto.dao;

import com.srivath.oto.entities.Person;

public interface PersonDao {
	
	void savePerson(Person person);
	
	Person findPerson(Integer personId);
	
	void deletePerson(Integer personId);

}
