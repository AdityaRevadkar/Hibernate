package com.Hibernate.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cof = new Configuration();
       cof.configure("com/Hibernate/hibernate/NewFile.cfg.xml");
       SessionFactory factory = cof.buildSessionFactory();
       
       Student1 s = new Student1();
       s.setRoll(10);
       s.setName("Aditya");
      
       
       Session ses = factory.openSession();
       
       Transaction tx=ses.beginTransaction();
       ses.save(s);
       tx.commit();
       
       
       
       ses.close();
       
    }
}
