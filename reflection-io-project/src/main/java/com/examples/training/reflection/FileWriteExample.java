package com.examples.training.reflection;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("d://result.txt");
		String data = "This is a sample data to write in file";
		try {
            fos.write(data.getBytes());
        } catch (Exception e) {

	}
	fos.close();
	System.out.println("Data written successfully in file");
}

}
