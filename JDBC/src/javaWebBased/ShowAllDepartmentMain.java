package javaWebBased;

import java.util.Collection;

import jdbc.dao.DaoInterface;
import jdbc.dao.DepartmentDao;
import jdbc.entity.Department;

public class ShowAllDepartmentMain {

	public static void main(String[] args) {
		
		DaoInterface<Department,Integer> daoRef=new DepartmentDao();
		
		Collection<Department>departments=daoRef.retrieveAll();
		
		for(Department dept : departments)
			System.out.println(dept);
			
		
		

	}

}
