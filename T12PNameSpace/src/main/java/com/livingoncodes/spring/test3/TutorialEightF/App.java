package com.livingoncodes.spring.test3.TutorialEightF;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
	Patient patient= (Patient) context.getBean("Patient");
	 Address address3=(Address)context.getBean("Address2");

	System.out.println(patient);
	System.out.println(address3);

	
	((FileSystemXmlApplicationContext) context).close();

}
}
