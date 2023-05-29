package com.Hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
 Configuration cfg=new Configuration();
 cfg.configure("com/Hibernate/hibernate/NewFile.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Student1 s = new Student1();
	s.setRoll(30);
	s.setName("mahesh");
	// Transient state
	
	Session ses = factory.openSession();
	Transaction tx =ses.beginTransaction();
	ses.save(s);
	//persistence state
	tx.commit();
	
	
	
	ses.close();
	factory.close();
	}

}
