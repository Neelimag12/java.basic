package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employees1{
	public static void main(String[] args){
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String userName = "postgres";
			String password ="4321";
			con = DriverManager.getConnection(url,userName,password);
			if(con != null) {
				System.out.println("Successfully connected");
			}
			else {
				System.out.println("Unable to connect");
			}
			Statement stmt = con.createStatement();
			
			createTable(stmt);
			addValues(stmt);
			displaydetails(stmt);

ResultSet rs = stmt.executeQuery("Select * from EMPLOYEES1");
			
			while(rs.next()) {
				System.out.println("NO: "+rs.getString("EMP_NO")+" Name: "+rs.getString("EMP_NAME")+" Salary: "+rs.getString("EMP_SALARY")+"Designation:"+rs.getString("EMP_DESGNTN")+"Department:"+rs.getNString("EMP_DEPT"));
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				System.out.println("Connection Closed Successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void createTable(Statement stmt) {
		String query = "CREATE TABLE EMPLOYEES1(EMP_NO VARCHAR(10) PRIMARY KEY,EMP_NAME VARCHAR(15) NOT NULL,EMP_SALARY VARCHAR(15)NOT NULL,EMP_DESGNTN CHAR(15) NOT NULL,EMP_DEPT CHAR(15)NOT NULL);";
		try {
			stmt.execute(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addValues(Statement stmt) {
		String query = "insert into Employees1 values(('A101','JOHN','190000','HR','HUMAN RESOURCE','A102','JINNIE','120000','MANAGER','MARKETING','A103','ALICE','75000','ASST MANAGER','SALES','A104','BOB','90000','STORE MANAGER','FINANCE','A105','MINNU','70000','GENERAL MANAGER','PRODUCTION');)";
		try {
			stmt.execute(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displaydetails(Statement stmt) {
		String query="select EMP_DESGNTN,EMP_DEPT from EMPLOYEES1;";
		try {
			stmt.execute(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	}

