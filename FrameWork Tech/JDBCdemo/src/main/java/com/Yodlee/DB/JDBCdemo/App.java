package com.Yodlee.DB.JDBCdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Yodlee.DB.helper.DBHelper;
import com.Yodlee.DB.manager.DB_Manager;
import com.Yodlee.DB.model.Yodlee_User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	Yodlee_User user1 = new Yodlee_User();
    	user1.setName("Jack");
    	user1.setPassword("123RR"); 
    	
    	System.out.println(DB_Manager.addUser(user1)); 
    } 
}
