package com.rishi.SalaryCalculatorSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SalaryCalculatorSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaryCalculatorSpringApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("SpringConfig.xml");
		Salary salary = (Salary)context.getBean("salary");
		
		System.out.println(salary.CalculateSalary());
	}

}
