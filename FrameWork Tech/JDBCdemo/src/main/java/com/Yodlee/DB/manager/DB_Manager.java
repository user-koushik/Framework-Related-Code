package com.Yodlee.DB.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.Yodlee.DB.helper.DBHelper;
import com.Yodlee.DB.model.Yodlee_User;
import com.mysql.jdbc.Statement;

public class DB_Manager {

	private static boolean status;
	private static PreparedStatement pre;
	private static Statement ste;
	
	/*private static Connection connec = DBHelper.getDBConnection();*/
	
	public static boolean addUser(Yodlee_User user){
		Connection connec = DBHelper.getDBConnection();
		int recs=0;
		try {
			pre=connec.prepareStatement("insert into yodlee_user values (?,?,?)");
			pre.setInt(1, user.getId());
			pre.setString(2, user.getName());
			pre.setString(3, user.getPassword());
			recs= pre.executeUpdate();
			if(recs>0)
				status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	/*public static List<Yodlee_User> getAllUsers()
	{
		Connection conn12 = DBHelper.getDBConnection();
		String select = "select * from yodlee_user";
		try {
			ste
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}*/
	
}
