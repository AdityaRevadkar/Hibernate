package com.Hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("com/Hibernate/hibernate/NewFile.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Project p = new Project();
		p.setP_id(12);
		p.setP_name("java web app");


		Project p1 = new Project();
		p1.setP_id(1212);
		p1.setP_name("python web app");


		Emp e1 = new Emp();
		e1.setName("ram");
		e1.setId(1);
		e1.setPro(p1);
	


		Emp e2 = new Emp();
		e2.setName("sham");
		e2.setId(2);
		e2.setPro(p);



		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(e1);
		ses.save(e2);
	   

		tx.commit();
		ses.close();
		factory.close();


	}

}
