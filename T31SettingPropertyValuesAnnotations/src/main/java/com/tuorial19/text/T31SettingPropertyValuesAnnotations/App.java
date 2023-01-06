package com.tuorial19.text.T31SettingPropertyValuesAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	  Cat cat=(Cat)context.getBean("cat");
	  cat.speak();
    ((FileSystemXmlApplicationContext)context).close();
  }
}
