package com.inheritance;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.addProperties(Config.connect());
		config.addAnnotatedClass(Payment.class);
		config.addAnnotatedClass(Card.class);
		config.addAnnotatedClass(Cheque.class);
        SessionFactory sf=config.buildSessionFactory();/*new Configuration().addAnnotatedClass(Payment.class).addAnnotatedClass(Card.class).addAnnotatedClass(Cheque.class).addProperties(prop).buildSessionFactory();*/
        Session ss=sf.openSession();
        Transaction trx=ss.beginTransaction();
   /*     Card card=new Card();
        card.setId(101);
        card.setAmount(20000);
        card.setCardtype("Visa");*/
        Cheque cq=new Cheque();
        cq.setId(104);
        cq.setAmount(222);
        cq.setChequetype("Axis");
        ss.save(cq);
        trx.commit();
        ss.close();
        sf.close();
	}

}
