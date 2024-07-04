package com.examples.training.reflection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardToFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// This is a sample code to write data from keyboard to file	
		FileWriter writer = new FileWriter("d://output.txt");
		
		// Use Scanner class to read data from keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the data to write in file - type exit to stop writing data");
		String line;
		
		while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
			writer.write(line+ System.lineSeparator());
		}
		System.out.println("Data written successfully in file");
		writer.close();

	}

}
