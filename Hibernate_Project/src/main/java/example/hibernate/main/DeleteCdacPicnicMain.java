package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class DeleteCdacPicnicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sessionFactoryObj=
				HibernateUtils.getSessionFactory();
				Session sessionObj= sessionFactoryObj.openSession()
				){
			CdacPicnic foundPicnic=
			sessionObj.find(CdacPicnic.class, 3);
			
			
			if(foundPicnic!=null) {
				Transaction trn=sessionObj.beginTransaction();
				sessionObj.remove(foundPicnic);
				trn.commit();
				System.out.println("Picnic Data DELETED ....");
				
				
			}else {
				System.out.println("Picnic Data not found Because Empty set!!!");
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}		
		

	}

}
