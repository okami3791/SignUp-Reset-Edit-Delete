package com.ken.userdaos.copy;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ken.user.UserData;

public class UserDAOS {

	public void insertCustomer(UserData u)
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); ;
		Session session=(Session) sf.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
		

	}
	
	public void updateUser(UserData u)
	{
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); ;
		Session session=(Session) sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(u);
		session.getTransaction().commit();
		session.close();
	}
	
	
	public void deleteUser(UserData u)
	{
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); ;
		Session session=(Session) sf.openSession();
		session.beginTransaction();
		session.delete(u);
		session.getTransaction().commit();
		session.close();
	}


}
