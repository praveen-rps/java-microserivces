package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentResultCalculation {

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
		String query = "select * from students";
		String qry1 = "update students set total=m1+m2+m3";

		String qry2 = "update students set result = ? where htno = ?";
		String qry3 = "update students set avgr = total/3";

		PreparedStatement pst = con.prepareStatement(qry2);
		st.executeUpdate(qry1); // udpate the total marks
		st.executeUpdate(qry3); // update the average marks

		// 5. execute the query
		ResultSet rs = st.executeQuery(query);

		// 6. Process the ResultSet
		String result = null;
		while (rs.next()) {
			int htno = rs.getInt(1);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			int m3 = rs.getInt(5);
			int total = rs.getInt(6);
			int avgr = rs.getInt(7);
			if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
				result="PASS";
			} else {
				result = "FAIL";
			}
			pst.setString(1, result);
			pst.setInt(2, htno);
			pst.executeUpdate();
		}
		System.out.println("Result Calculation Done");
		// 7. Close the objects
		rs.close();
		st.close();
		con.close();
	}
}
