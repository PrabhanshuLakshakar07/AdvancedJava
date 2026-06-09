package javaWebBased;

import jdbc.dao.DaoInterface;
import jdbc.dao.DepartmentDao;
import jdbc.entity.Department;

public class ShowDepartmentByDeptNoMain {

	public static void main(String[] args) {
	
		DaoInterface<Department,Integer> daoRef=new DepartmentDao();
		Department dept =daoRef.retrieveById(10);
		if(dept!=null)
			System.out.println(dept);
		else 
			System.out.println("Department With Given ID does not exist..");

	}

}
