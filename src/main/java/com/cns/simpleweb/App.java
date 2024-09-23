package com.cns.simpleweb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
	
    public static void main( String[] args )
    {
    
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Computer computer = context.getBean(Computer.class);
    	computer.print();
    }
}
