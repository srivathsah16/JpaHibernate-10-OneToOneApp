package com.srivath.oto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.oto.dao.PersonDao;
import com.srivath.oto.entities.Person;

public class PersonDaoImpl implements PersonDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void savePerson(Person person) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(person);
			txn.commit();
			System.out.println("Person entity persisted..........");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error while persisting Person....");
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public Person findPerson(Integer personId) {
		EntityManager em = factory.createEntityManager();
		Person person = em.find(Person.class, personId);
		em.close();
		return person;
	}

	@Override
	public void deletePerson(Integer personId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Person person = em.find(Person.class, personId);
			em.remove(person);
			txn.commit();
			System.out.println("Person entity deleted....");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error while deleting person......");
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
