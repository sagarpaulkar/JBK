package com.kiranacademy.Abstraction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.JdbcConnection;

public class Test
{
	static Operations giveMeObject()
	{
		OperationsImpl obj=new OperationsImpl();
		
		// obj(5000)==> [ cube() ] Operation class object at address 5000
		
		return obj;
		
		//return new OperationsImpl();
	}
	
	public static void main(String[] args) throws Exception {
		
		Operations obj=Test.giveMeObject();
		
		obj.cube(3);
		
		//Operations.x=40;
		
		System.out.println(Operations.x);
		
		Connection con=DriverManager.getConnection("");
		
		// class ConnectionImpl implements Connection
		
	//	ConnectionImpl con=(ConnectionImpl) DriverManager.getConnection("");
		
		// getConnection() gives object of implementation class of Connection interface
		// But we do NOT know implementation class name and hence we create
		// reference of Connection interface.
		
		
		
		
		
		
		
		
		
		
	}
}
