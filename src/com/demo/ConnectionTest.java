package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
		
		Connection connection = null;
	
		public Connection getConnectionDetails() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
}
