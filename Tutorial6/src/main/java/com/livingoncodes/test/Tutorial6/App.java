package com.livingoncodes.test.Tutorial6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Patient patient = (Patient) context.getBean("Patient");
		patient.speak();
		//Address address =(Address)context.getBean("address");
		System.out.println(patient);
	//	System.out.println(address);
		
		((FileSystemXmlApplicationContext) context).close();

	}
}
