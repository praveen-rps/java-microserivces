package com.examples.training.reflection;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = new FileWriter("d://broutput.txt");
		
		System.out.println("enter quit to stop reading data");
		
		String line;
		
		while(!(line = br.readLine()).equalsIgnoreCase("quit")) {
			 writer.write(line+ System.lineSeparator());
            
        }
		System.out.println("Data written successfully in file");
		
		writer.close();
		br.close();
	}

}
