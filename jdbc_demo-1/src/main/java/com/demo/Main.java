package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	//System.out.println("Maven hello");
		
		Connection connection=null;
		try {
			//Step 1, load driver
			Class.forName("org.postgresql.Driver"); //class name of driver in dbeaver
			System.out.println("Driver loaded...");
			//Step 2, open connection (url, username, password)
			String url="jdbc:postgresql://localhost:5432/postgres"; //url template in dbeaver
			String username="postgres";
			String password="postgres";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connected...");
			//Step 3, create statement
			Statement statement=connection.createStatement();
			String sql="select id,name,age,tid from test.player order by age desc";
			System.out.println("Statement created...");
			//Step 4, execute query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed...");
			//Step 5, process results
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.println(" Team Id : "+resultSet.getInt("tid"));
			}
			System.out.println("Results processed...");
		} catch (ClassNotFoundException e) { //added catch block automatically
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			try {
				//Step 6, close connection
				connection.close();
				System.out.println("Connection closed...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		

	}

}
