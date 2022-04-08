package com.learn.hibernate3.OnetoOneMapping;

import java.util.ArrayList;
import java.util.List;

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
         Session s= sf.openSession();
         Transaction tx= s.beginTransaction();
         Bikes b1= new Bikes();
         Bikes b2= new Bikes();
         Bikes b3= new Bikes();
         Bikes b4= new Bikes();
         List<Bikes> blist1=new ArrayList<Bikes>();
         List<Bikes>blist2= new ArrayList<Bikes>();
         List<Students>Slist1=new ArrayList<Students>();
         List<Students>Slist2=new ArrayList<Students>();
        
         
         blist1.add(b1);
         blist1.add(b2);
         blist2.add(b3);
         blist2.add(b4);
         
         Students s1= new Students(101,"Sai","Mech",2021,blist1);
         Students s2= new Students(102,"Karthik","Cse",2014,blist2);
         Students s3= new Students(103,"Rajesh","Ece",2011,blist1);
         Students s4= new Students(104,"Ravi","EEE",2017,blist2);
           Slist1.add(s1);
           Slist1.add(s3);
           Slist2.add(s2);
           Slist2.add(s4);
         b1.setEngine_NO(1111);
         b1.setModel("Yamaha");
         b1.setCost(150000);
         b1.setStList(Slist1);
         b2.setEngine_NO(2222);
         b2.setModel("Avengers");
         b2.setCost(120000);
         b2.setStList(Slist2);
         b3.setEngine_NO(3333);
         b3.setModel("Activa");
         b3.setCost(75000);
         b3.setStList(Slist1);
         b4.setEngine_NO(4444);
         b4.setModel("Royal Enfield");
         b4.setCost(200000);
         b4.setStList(Slist2);
         s.save(b1);
         s.save(b2);
         s.save(b3);
         s.save(b4);
         s.save(s1);
         s.save(s2);
         s.save(s3);
         s.save(s4);
        
         tx.commit();
    }
}
