package com.capgemini.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class UserService {
	public String getUserNameById(int id) throws SQLException, IOException
	{
		//logic to get the userName from data store
		if(id >= 101)
			return "Sanjay";
		else
			return "Guest";
	}
}
