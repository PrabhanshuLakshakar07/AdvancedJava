package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	public static Connection getConnection() throws Exception{
		
		//code to obtain Connection and return the same 
		  //  String driverClassName = "com.mysql.cj.jdbc.Driver";  //this is no longer since java version 6 beceuse this loading is automatic by jdbc
	        //if ssl waring so do in cdac?useSSL=false
	        String connectionURL ="jdbc:mysql://localhost:3306/cdac?useSSL=false";
	        String userId ="root";
	        String password ="root";
	        
	        //Class.forName(driverClassName);
	       return DriverManager.
            getConnection(connectionURL,userId,password);
		
	}

	
	
	
	
	
	
}
