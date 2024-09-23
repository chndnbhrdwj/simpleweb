package com.cns.simpleweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
    public static void main( String[] args )
    {
    
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Computer computer = context.getBean(Computer.class);
    	computer.print();
    }
}
