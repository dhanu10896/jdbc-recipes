package com.pluralsight.corejdbc.m3c1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductsComponent {

	public boolean tryConnection() throws Exception {	

		
		Connection connection =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=passmeserverTimezone=UTC&useSSL=false");
		
		
		boolean isValid = connection.isValid(2);
		
		
		connection.close();	
			
		
		return isValid;
    }

}

