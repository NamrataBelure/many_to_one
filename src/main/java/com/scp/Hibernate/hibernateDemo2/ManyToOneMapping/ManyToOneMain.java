package com.scp.Hibernate.hibernateDemo2.ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneMain {

	public static void main(String[] args) {
		
	College c1=new College(01,"sp",null);
	College c2=new College(02,"Fc",null);
	College c3=new College(03,"NIT",null);
	
	List<College>ListOfCollage=new ArrayList<College>();
	
	ListOfCollage.add(c1);
	ListOfCollage.add(c2);
	ListOfCollage.add(c3);
	
	University u1=new University(101,"puneUniversity",ListOfCollage);
	
	u1.setCollege(ListOfCollage);
	
	c1.setUniversity(u1);
	c2.setUniversity(u1);
	c3.setUniversity(u1);
	
	Configuration c = new Configuration();
	SessionFactory Factory = c.configure("/com/scp/Hibernate/hibernateDemo2/ManyToOneMapping/ManyToOne.cfg.xml").buildSessionFactory();
	Session session = Factory.openSession();
	Transaction tr = session.beginTransaction();
	session.save(u1);
	//session.save(u2);
	session.flush();
	tr.commit();
	System.out.println("Done!!!!!!!!");
	session.close();
	}

}
