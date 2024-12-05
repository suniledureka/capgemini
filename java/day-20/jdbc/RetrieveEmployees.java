package com.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat("sal"); //rs.getFloat(3);
			
			String emp = String.format("%-5d   %-20s   %.2f", eno, name, sal);
			System.out.println(emp);
			
			Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
