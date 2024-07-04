package com.examples.training.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class<?> personClassDetails = Class.forName("com.examples.training.reflection.Person");
		
		System.out.println("Class Name --> " + personClassDetails.getName());
		
		System.out.println("Fields in class are ");
		System.out.println("-----------------------");
		Field[] fields = personClassDetails.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("Methods in class are ");
		System.out.println("-----------------------");
		Method[] methods = personClassDetails.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("Constructors in class are ");
		System.out.println("-----------------------");
		
		Constructor<?>[] constructors = personClassDetails.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor.getName());
			System.out.println("The number of Parameters are: "+constructor.getParameterCount());
		}
		
		System.out.println("Super Class Name --> " + personClassDetails.getSuperclass().getName());
		
		System.out.println("Interfaces implemented by class are ");
		System.out.println("-----------------------");
		Class<?>[] interfaces = personClassDetails.getInterfaces();
		for (Class<?> interface1 : interfaces) {
			System.out.println(interface1.getName());
		}
		
		System.out.println("Package Name --> " + personClassDetails.getPackage().getName());
		
		Constructor<?> consts = personClassDetails.getConstructor(String.class,int.class);
		Person p = (Person) consts.newInstance("Anil",25);
		p.printPerson();
		
	}
}
