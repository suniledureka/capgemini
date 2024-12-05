package com.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL Jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to db_capgemini Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_capgemini",
												"root", "root");
		
		//--  create an object for passing SQL Queries to db_capgemini
		Statement st = con.createStatement();
		
		//-- pass the SQL Query
		String sql = "create table emp(empno int(5), ename varchar(40), sal float(10,2), "
				+ "primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Databse Table \"emp\" created!!!");
		}catch(Exception ex) {
			System.err.println("ERROR: " + ex.toString());
		}
		
		//-- close connection with db_capgemini
		st.close();
		con.close();
	}
}