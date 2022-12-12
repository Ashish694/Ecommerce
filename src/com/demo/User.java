package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
	
		Connection connection=null;
		PreparedStatement pst=null;
	
		public void insertUserData(String name,String email,String password) throws SQLException {
					try {
						ConnectionTest connectionTest = new ConnectionTest();    
						connection = connectionTest.getConnectionDetails(); 
						
						pst = connection.prepareStatement("insert into user(name,email,password) values(?,?,?)");    
						pst.setString(1, name);    
						pst.setString(2, email);    
						pst.setString(3, password);
						pst.executeUpdate();
						System.out.println("Record inserted...");
						connection.close();
						pst.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
			
		}
		
		public static void main(String[] args)throws SQLException {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Enter name>>");    
				  String name = sc.next();    
				  System.out.println("Enter email>>");    
				  String email = sc.next(); 
			  
			   System.out.println("Enter password>>");    
			   String password = sc.next();    
			  
				User user=new User();
				user.insertUserData(name,email,password);
	
			 
		}
}
