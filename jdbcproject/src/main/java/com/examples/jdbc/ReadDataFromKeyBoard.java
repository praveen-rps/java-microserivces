package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This program reads the data from the keyboard and inserts into the table
 */
public class ReadDataFromKeyBoard {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;

		// 1. Loading the Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establishing the Connection

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "root");
		
		// 3. write the dynamic query
		String query ="insert into students values(?,?,?,?,?)";
		
		// 4. Create the PreparedStatement Object
		PreparedStatement pst = con.prepareStatement(query);
		
		
		// 5. Read the data from the keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the htno");
		int htno = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the m1");
		int m1 = sc.nextInt();
		System.out.println("Enter the m2");
		int m2 = sc.nextInt();
		System.out.println("Enter the m3");
		int m3 = sc.nextInt();
		
		
		// 6. Set the values for the placeholders on preparedStatement object
		pst.setInt(1, htno);
		pst.setString(2, name);
		pst.setInt(3, m1);
		pst.setInt(4, m2);
		pst.setInt(5, m3);
		
		// 7. execute the query
		
		int k = pst.executeUpdate();
		if (k > 0)
			System.out.println("Record Inserted Successfully");
		else
			System.out.println("Record Insertion Failed");
		
		// 8. Close the objects
		sc.close();
		pst.close();
		con.close();
		
		


	}

}
