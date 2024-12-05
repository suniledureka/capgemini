 package com.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno, ename, sal) values(102, 'Suresh', 2500.5),"
				+ "(103, 'Charles', 3500.5), (104, 'Valerie', 4785),"
				+ "(105, 'Pankaj', 8500.75)";
		
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
