package com.examples.commentsproject.dbutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnections {
	
	public static Connection con = null;
	static Properties props = new Properties();
	static FileInputStream fis= null;
	
	public static Connection getDatabaseConnection() throws FileNotFoundException {
		try {
			fis = new FileInputStream("d://dbprops.properties");
			props.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
            Class.forName(props.getProperty("spring.datasource.driver-class-name"));
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(props.getProperty("spring.datasource.url"), props.getProperty("spring.datasource.username"), 
            		props.getProperty("spring.datasource.password"));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    
	}
}
