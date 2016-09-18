package ro.implantodays.controllers;

import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String user, String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql:/ /sorio.go.ro/phpmyadmin:3306","root","cocolino");
         PreparedStatement ps =con.prepareStatement
                             ("select * from Users where username=? and password=?");
         ps.setString(2, user);
         ps.setString(3, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}