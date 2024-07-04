package com.examples.training.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d://empdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);

	}

}
