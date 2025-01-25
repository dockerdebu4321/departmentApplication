package com.practiceproject.Springbootpractice.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy

public class SpringBootPracticeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeProjectApplication.class, args);
	}

}
