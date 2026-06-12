package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Picnic;

public class CreatePicnicMain {

	public static void main(String[] args) {
		
		Session sessionObj = null;
		SessionFactory sessionFactoryObj=null;
		
		try {
			Configuration conf =new Configuration();
			conf.configure(); //looks for hibernate.cfg.xml  file
			sessionFactoryObj = conf.buildSessionFactory();
			sessionObj =sessionFactoryObj.openSession();
			
			Picnic ourPicnic =new Picnic(102, "Water Kindom , Gorai" , "19th june 2026" ,28);
			Transaction trn = sessionObj.beginTransaction();
			sessionObj.persist(ourPicnic);
			
			trn.commit();
			System.out.println("Picnic Record added...");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
			sessionObj.close();
			
			sessionFactoryObj.close();
		}
		
		
		

	}

}
