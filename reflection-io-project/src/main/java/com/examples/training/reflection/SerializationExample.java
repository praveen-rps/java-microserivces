package com.examples.training.reflection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1, "John", "IT");
		Employee emp2 = new Employee(2, "Doe", "HR");
		FileOutputStream fos = new FileOutputStream("d://empdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		oos.close();
		fos.close();
		System.out.println("objects serialized successfully in file");
		
		
	}

}
