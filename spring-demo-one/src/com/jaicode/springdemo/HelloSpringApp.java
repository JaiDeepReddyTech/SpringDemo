package com.jaicode.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
public static void main(String[] args) {
//	load the spring configuration file
ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//	 Retrieve bean from spring container
	Coach theCoach=context.getBean("sport",Coach.class);
//	call method on beam
	theCoach.timings();
System.out.println(theCoach.getDailyWorkout());

//	close the context
//context.close();
}
}
