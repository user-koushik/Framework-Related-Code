package com.Apache.Helpers;

import java.util.ResourceBundle;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBHelper {
	
	private static BasicDataSource dataSrc;
	private static ResourceBundle resbndle;
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
	
    
	public static BasicDataSource getDBConnection(){
		
		resbndle=ResourceBundle.getBundle("com.Apache.resources/db"); 
		
		driver=resbndle.getString("driver");
    	username=resbndle.getString("user");
    	password=resbndle.getString("password");
    	url=resbndle.getString("url");
    	
		dataSrc = new BasicDataSource();
		
		dataSrc.setDriverClassName(driver); 
		dataSrc.setUrl(url);
		dataSrc.setUsername(username);
		dataSrc.setPassword(password);
		dataSrc.setMaxIdle(5);
		dataSrc.setMaxTotal(100);
		dataSrc.setMaxWaitMillis(2000); 
		
		return dataSrc;
	}

}
