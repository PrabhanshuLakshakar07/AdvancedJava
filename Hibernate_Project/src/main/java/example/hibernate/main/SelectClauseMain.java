package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class SelectClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(
				SessionFactory sessionFactoryObj=
				HibernateUtils.getSessionFactory();
				Session sessionObj= sessionFactoryObj.openSession()
				){
			
			String hqlQuery ="select location , headCount from cdacPicnic cdac";
			Query<Object[]> queryObj=
			sessionObj.createQuery(hqlQuery,Object[].class);
			
			List<Object[]> picnicDataList=queryObj.list();
			for(Object[] picnicData:picnicDataList) {
				Object location=picnicData[0];
				Object headCount=picnicData[1];
				System.out.println("Location" + location + " , Head count :"+ headCount);
			}
			
			
             
           
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

		
		
	}

}
