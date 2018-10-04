package com.Apache.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.Apache.Helpers.DBHelper;
import com.Apache.model.Yodlee_User;


public class Yodlee_User_Manager {

	private static boolean status;
	private static BasicDataSource dsrc;
	private static Connection conn;
	private static PreparedStatement pre;
	private static Statement st;
	private static List<Yodlee_User> userList;
	private static ResultSet rs;
	
	//insert
	public static boolean addUser(Yodlee_User user)
	{
		dsrc = DBHelper.getDBConnection();
		int recs=0;
		try {
			conn = dsrc.getConnection();
			pre=conn.prepareStatement("insert into yodlee_user values(?,?,?)");
			pre.setInt(1, user.getUserId());
			pre.setString(2,user.getName());
			pre.setString(3, user.getPassword());
			recs= pre.executeUpdate();
			if(recs>0)
				status=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//select
	
	public static List<Yodlee_User> getAllUsers()
	{
		dsrc = DBHelper.getDBConnection(); 
		
		// Will not required to get the connection, would be using Apache DBCP
		
		/*conn=(Connection) DBHelper.getDBConnection();
		st=conn.createStatement();*/
		
		String query="select * from yodlee_user";
		try {
			conn = dsrc.getConnection();
			rs=conn.createStatement().executeQuery(query); 
			userList=new ArrayList<Yodlee_User>();
			Yodlee_User user=null; 
			while(rs.next())
			{
				user=new Yodlee_User();
				user.setUserId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				userList.add(user);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 return userList;
		
		
	}
	
	
}
