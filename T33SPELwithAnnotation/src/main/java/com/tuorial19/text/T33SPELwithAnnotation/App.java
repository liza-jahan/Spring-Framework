package com.tuorial19.text.T33SPELwithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Parrot parrot = (Parrot) context.getBean("parrot");
		parrot.speak();
		((FileSystemXmlApplicationContext) context).close();
	}
}
