package ro.implantodays.controllers;

import java.sql.*;

import ro.implantodays.utils.DBConnection;

public class Validate
 {
	
     public static boolean checkUser(String user, String pass) 
     {
    	 DBConnection c = new DBConnection();
    	 
 	 //creating connection with the database 
         Connection con= c.getConnection();
         PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from Users where username=? and password=?");
			 ps.setString(1, user);
	         ps.setString(2, pass);
	         ResultSet rs =ps.executeQuery();
	         return  rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
        
        
     
                          
  }   
}