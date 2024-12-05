 package com.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101, 'Sanjay', 2500.5)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employees Saved = " + employeesSaved);
		}catch(Exception ex) {
			System.err.println(ex.toString());
		}
		st.close();
		con.close();
	}

}
