package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;

		// 1. Loading the Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establishing the Connection

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "root");

		// 3. Create the Statement Object
		st = con.createStatement();

		// 4. write the query to create a table
		String query = "create table students(htno int, name varchar(20), m1 int, m2 int, m3 int)";

		// 5. execute the query
		st.execute(query);
		System.out.println("Table Created Successfully");

		
		// 7. Close the objects
		
		st.close();
		con.close();

	}

}
