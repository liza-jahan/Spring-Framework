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
	Patient patient1 = (Patient) context.getBean("Patient");
	Patient patient2 = (Patient) context.getBean("Patient");
	
	patient1.setName("liza");
	System.out.println(patient2);

	
	((FileSystemXmlApplicationContext) context).close();

}
}
