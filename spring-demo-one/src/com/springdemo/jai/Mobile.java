package com.springdemo.jai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    Sim theSim=context.getBean("card",Sim.class);
    
    System.out.println(theSim.calling());
    theSim.data();
	}

}
