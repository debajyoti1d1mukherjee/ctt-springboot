package com.ctt;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
	//AS JAR
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Learn Microservices from CTT...........");
	}

	//As WAR
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}
	
	

}

@RestController
class DemoService{	
	@RequestMapping("/ctt")
	public String getMessageForService() {
		return "Learn Microservices from CTT......";
	}
}
