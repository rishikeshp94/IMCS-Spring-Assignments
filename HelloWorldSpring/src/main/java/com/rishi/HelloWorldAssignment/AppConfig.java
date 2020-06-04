package com.rishi.HelloWorldAssignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="greetWorld")
	public GreetJavaConfig Greet() {
		return new GreetJavaConfig();
	}

}
