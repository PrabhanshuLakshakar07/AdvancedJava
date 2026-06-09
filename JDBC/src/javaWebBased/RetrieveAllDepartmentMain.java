package javaWebBased;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveAllDepartmentMain {

    public static void main(String[] args) {
    	
    	/*
    	 * 1. load the driver
    	 * 2. estabilash connection with db 
    	 * 3. obtain some statement
    	 * 4, execute sql query
    	 * 5.  in case of select query, obtain , resultSet 
    	 * */

        String driverClassName = "com.mysql.cj.jdbc.Driver";
        //if ssl waring so do in cdac?useSSL=false
        String connectionURL ="jdbc:mysql://localhost:3306/cdac?useSSL=false";
        String userId ="root";
        String password ="root";
        Connection dbConncetion = null;
        
        Statement stmt = null;
        ResultSet rs = null;
        

        try {
            Class.forName(driverClassName);
            System.out.println("Driver loaded.");
            
            dbConncetion =
            DriverManager.
            getConnection(connectionURL,userId,password);
            System.out.println("Connected To mySQL Db badiya kar raha h tu ");
            
            stmt = dbConncetion.createStatement();
            
            String sqlQuery="select dname ,loc ,deptno from dept";
            
           rs= stmt.executeQuery(sqlQuery); // make call toward database
           while (rs.next()) {
        	  String deptName= rs.getString(1);
        	  String deptLoc= rs.getString(2);
        	   int deptNo =rs.getInt(3);
        	   System.out.println(deptName + "," + deptLoc + "," +deptNo + "");
           }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        finally {
        	try {
				rs.close();
				stmt.close();
				dbConncetion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}