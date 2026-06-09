package javaWebBased;

import jdbc.dao.DaoInterface;
import jdbc.dao.DepartmentDao;
import jdbc.entity.Department;

public class CreateDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Department,Integer> daoRef=new DepartmentDao();
		
		Department dept = new Department(50,"Finance" , "Mumbai");
		daoRef.create(dept);

	}

}
