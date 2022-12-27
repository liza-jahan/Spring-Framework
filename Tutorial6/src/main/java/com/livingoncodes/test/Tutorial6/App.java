package com.livingoncodes.test.Tutorial6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
	  Patient patient=(Patient)context.getBean("Patient");
	patient.speak();
	((FileSystemXmlApplicationContext)context).close();
	
}
}
