package com.rishi.HelloWorldAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloWorldAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAssignmentApplication.class, args);
		
//		XML based Configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
//		Annotation Based Configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext("SpringConfigAnnotation.xml");
		
//		Java Based Configuration
		ApplicationContext context = new AnnotationConfigApplicationContext("AppConfig.class");
		
		Greet greetWorld = (Greet) context.getBean("greetWorld");
		greetWorld.greet();
	}

}
