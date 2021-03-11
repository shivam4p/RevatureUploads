package com.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			// Step1 -- Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully");

			// Step 2 - Open Connection
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "Itunes123@"; // Give your DB username and password.. These are Dr.Vinay's Postgres
											// Username/password
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Opened");
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			//String sql="select id,name,age,city, gender from player_schema.player";
			String sql="select p.id, p.name, p.city, p.age ,p.gender, t.teamname, t.location " + 
					"from player_schema.player p   join player_schema.team t " + 
					"on p.teamid =t.teamid order by age desc";
			//Step 4 - Execute Query
			ResultSet resultSet= statement.executeQuery(sql);
			System.out.println("Query executed");

			//Step 5 - Process Results
			System.out.println("Printing all Players");
			while(resultSet.next()) {
				System.out.print(" Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.print(" TeamName : "+resultSet.getString("teamname"));
				System.out.println(" Team Location : "+resultSet.getString("location"));
			}
			
			System.out.println("Results Processed Successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				//Step 6 - release COnnection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}
}
