package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchDataFromTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;

		// 1. Loading the Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establishing the Connection

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "root");

		// 3. write the dynamic query
		String query = "select * from students where htno=?";

		// 4. Create the PreparedStatement Object
		PreparedStatement pst = con.prepareStatement(query);

		// 5. Read the data from the keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the htno");
		int htno = sc.nextInt();

		// 6. Set the values for the placeholders on preparedStatement object
		pst.setInt(1, htno);

		// 7. execute the query

		ResultSet rs = pst.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " "
						+ rs.getInt(5));
			}
		} else {
			System.out.println("Record not found");
		}
		// 8. Close the objects
		sc.close();
		pst.close();
		con.close();

	}

}
