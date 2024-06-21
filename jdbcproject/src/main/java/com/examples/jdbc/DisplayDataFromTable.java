package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDataFromTable {

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

		// 4. write the query
		String query = "select * from notes";

		// 5. execute the query
		ResultSet rs = st.executeQuery(query);

		// 6. Process the ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}

		// 7. Close the objects
		rs.close();
		st.close();
		con.close();

	}

}
