package com.Hibernate.hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HqlExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/Hibernate/hibernate/NewFile.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		//HQL
		String query = "from Student1";
		
		Query q=s.createQuery(query);
		
		List<Student1> l = q.list();
		for(Student1 ss : l) {
			System.out.println(ss.getName()+" "+ss.getRoll());
		}
		
		
		
		
		
		
s.close();
factory.close();
	}

}
