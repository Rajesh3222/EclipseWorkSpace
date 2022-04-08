package com.Demo.com.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    Configuration cfg=    new Configuration().configure();
             SessionFactory sf=  cfg.buildSessionFactory();
           Students s1 = new Students(103,"Karthik","Ece",2014);
           /*Bike b= new Bike(3333,"FZ-S", 160000);*/
           Session s= sf.openSession();
           Transaction tx= s.beginTransaction();
           s.save(s1);
        /*   s.save(b);*/
           tx.commit();
    }
}
