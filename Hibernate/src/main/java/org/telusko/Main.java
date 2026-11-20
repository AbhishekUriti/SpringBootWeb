package org.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Alien a1=new Alien();
       a1.setAid(104);
       a1.setAname("Tori");
       a1.setTech("Databases");

       //Hibernate save with a1 object

        SessionFactory factory= new Configuration()
                .addAnnotatedClass(org.telusko.Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session=factory.openSession();
        Transaction transaction= session.beginTransaction(); // add the data to DB
        session.persist(a1);
//        transaction.commit();
//        Alien alien=session.find(Alien.class,103); // Fetching the data
//        System.out.println(alien);
//        Transaction transaction= session.beginTransaction();
//        Alien alien1=session.find(Alien.class,104);
////        session.merge(a1);
//        session.remove(alien1);
        transaction.commit();
        session.close();
        factory.close();
    }
}