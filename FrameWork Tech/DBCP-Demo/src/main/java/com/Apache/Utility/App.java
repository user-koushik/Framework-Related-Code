package com.Apache.Utility;

import com.Apache.DAO.Yodlee_User_Manager;
import com.Apache.model.Yodlee_User;

public class App {

	public static void main(String[] args) {
		
		Yodlee_User user1 = new Yodlee_User();
		
    	user1.setName("Freya");
    	user1.setPassword("freya123"); 
    	
    	System.out.println(Yodlee_User_Manager.addUser(user1));  
    	
    	System.out.println("Getting the Data:" + Yodlee_User_Manager.getAllUsers());
    	
	}

}
