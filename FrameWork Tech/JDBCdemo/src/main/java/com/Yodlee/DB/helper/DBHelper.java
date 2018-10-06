package com.Yodlee.DB.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBHelper {
	
	private static Connection conn;
    private static ResourceBundle resbndle;
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    
    public static Connection getDBConnection(){
    	
    	resbndle=ResourceBundle.getBundle("com.Yodlee.DB.Resource/db"); 
    	
    	driver=resbndle.getString("driver");
    	username=resbndle.getString("user");
    	password=resbndle.getString("password");
    	url=resbndle.getString("url");
    	
    	try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return conn;
    }

}
