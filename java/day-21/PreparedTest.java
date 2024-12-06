package com.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		PreparedStatement pst = con.prepareStatement("insert into emp (empno, ename, sal) values(?, ?, ?)");
		
		Scanner sc = new Scanner(System.in);
		String req = "Y";
		
		do {
			System.out.print("enter employee no: ");
			int eno = sc.nextInt();
			sc.nextLine();
			
			System.out.print("enter employee name: ");
			String name = sc.nextLine();
			
			System.out.print("enter employee salary: ");
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			if(n > 0)
				System.out.println("###--- Employee Saved ---###");
			
			System.out.print("\ndo you want to save more employee(s)? [Y/N]: ");
			req = sc.next();
		}while(req.equalsIgnoreCase("Y"));
		pst.close();
		con.close();
	}

}
