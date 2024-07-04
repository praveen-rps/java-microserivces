package com.examples.training.reflection;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("d://sample.txt");
		
		int content;
		while ((content = fis.read()) != -1) {
			System.out.print((char) content);
		}
		
		fis.close();
		

	}

}
