package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class FromClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(
				SessionFactory sessionFactoryObj=
				HibernateUtils.getSessionFactory();
				Session sessionObj= sessionFactoryObj.openSession()
				){
			
			String hqlQuery ="from CdacPicnic cdac";
			
			Query<CdacPicnic> queryObj=
			sessionObj.createQuery(hqlQuery, CdacPicnic.class);
             List<CdacPicnic> listOfPicnics=queryObj.list();	
//             
//             for(CdacPicnic currentPicnic :listOfPicnics) {
//            	 System.out.println(currentPicnic);
//            	 
//             }
             
             
             listOfPicnics.stream().
             forEach(picnic -> System.out.println(picnic));
             
           
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

		
		
	}

}
