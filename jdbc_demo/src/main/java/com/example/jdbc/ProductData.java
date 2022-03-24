package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductData {
	public static void main(String args[])throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/postgres";
			String userName="postgres";
			String password="4321";
			Connection con=DriverManager.getConnection(url,userName,password);
				if(con!=null) {
					System.out.println("Successfully connected::");
				}else {
					System.out.println("Connection refused:");
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
