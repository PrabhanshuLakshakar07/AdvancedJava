package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import jdbc.entity.Department;
import jdbc.utils.JdbcUtils;

public class DepartmentDao implements 

DaoInterface<Department , Integer>{

	@Override
	public Collection<Department> retrieveAll() {
		
		Collection<Department> allDepartments= new ArrayList<>();
		
		String sqlQuery ="select dname,loc,deptno from dept";
		try(
				Connection dbConn =JdbcUtils.getConnection();
				 Statement stmt =dbConn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				
				){
			 while (rs.next()) {
	        	  String deptName= rs.getString(1);
	        	  String deptLoc= rs.getString(2);
	        	   int deptNo =rs.getInt(3);
	        	   //creating department object based upon dept data
	        	   Department dept =new Department(deptNo,deptName,deptLoc);
	        	   
	        	   //Adding the department into alldepartment collection...
	        	   
	        	   allDepartments.add(dept);
	        	   
	        	   
	        	  
	           }
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		
		return allDepartments;
	}

	@Override
	public Department retrieveById(Integer deptNo) {
		Department foundDept =null;
		
		
		String sqlQuery =
				"select dname , loc ,deptno from dept where deptno = ?";
		try(
				
				Connection dbConn = JdbcUtils.getConnection() ;
				PreparedStatement pstmt =dbConn.prepareStatement(sqlQuery)
				
;
				
				
				){
			pstmt.setInt(1, deptNo);
	ResultSet rs= pstmt.executeQuery();	
	if(rs.next()) {
		
		 String deptName= rs.getString(1);
   	  String deptLoc= rs.getString(2);
   	   int dept_No =rs.getInt(3);
   	   foundDept =new Department(dept_No,deptName,deptLoc);
	}
	
		} catch (Exception ex) {
			
			
			ex.printStackTrace();
		}
		
		return foundDept;
	}

	@Override
	public void create(Department newDept) {
		
		String sqlQuery=
				"insert into dept value (?,?,?)";
try(
				Connection dbConn = JdbcUtils.getConnection() ;
				PreparedStatement pstmt =dbConn.prepareStatement(sqlQuery)
		
				
				){
	
	int deptNo=newDept.getDeptNo();
	String name =newDept.getName();
	String location = newDept.getLocation();
	
	pstmt.setInt(1, deptNo);
	pstmt.setString(2, name);
    pstmt.setString(3, location);	
    int count = pstmt.executeUpdate();
    System.out.println(count +" record inserted.");
	
}catch (Exception ex) {
	// TODO Auto-generated catch block
	ex.printStackTrace();
}
		
		
		
	}

	@Override
	public void update(Department modifiedEntityObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
