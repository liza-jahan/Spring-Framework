package com.tuorial19.text.T19AutoWearing;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
	  Logger logger=(Logger)context.getBean("logger");
	  
	  logger.writeConsol("hellow");
	  logger.writeFile("Hello World!");
	  
	  ((FileSystemXmlApplicationContext)context).close();
  }
}
