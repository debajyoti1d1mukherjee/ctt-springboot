package com.ctt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


@RestController
class DemoService{	
	@Value( "${address}" )
	private String address;
	
	@RequestMapping(value="/ctt-profiles-test",method=RequestMethod.GET)
	public String getMessageForService() {
		return "Address is "+address;
	}
}
