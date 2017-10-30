package com.macross.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionRobotech {

	Connection connection = null;
	
	public Connection getConnection(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://localhost/robotech?" +
                    "user=root&password=");
			
		}catch(Exception error){
			error.printStackTrace();
		}
		
		return connection;
	}
	
	public void close() throws SQLException{
		connection.close();
	}
	
}
