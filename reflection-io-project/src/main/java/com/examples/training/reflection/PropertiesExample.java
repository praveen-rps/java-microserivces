package com.examples.training.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("d://dbprops.properties");
		props.load(fis);
		String port = props.getProperty("server.port");
		String url = props.getProperty("spring.datasource.url");
		String username = props.getProperty("spring.datasource.username");
		String password = props.getProperty("spring.datasource.password");
		String driver = props.getProperty("spring.datasource.driver-class-name");
		String eurekaZone = props.getProperty("eureka.client.service-url.defaultZone");
		System.out.println("Server Port: "+port);
		System.out.println("URL: "+url);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Driver: "+driver);
		System.out.println("Eureka Zone: "+eurekaZone);
		
		fis.close();
		props.clear();
		
		

	}

}
