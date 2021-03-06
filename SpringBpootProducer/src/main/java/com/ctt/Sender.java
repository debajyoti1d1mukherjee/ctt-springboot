package com.ctt;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class Sender {
	@Autowired
	RabbitTemplate template;
	@Bean
	Queue queue(){
		return new Queue("DemoQ",false);
	}
	 @Bean
	    TopicExchange exchange() {
	        return new TopicExchange("DemoExchange");
	    }
	 

	 
	public void send(String message){
		//template.convertAndSend("DemoQ", message);
		System.out.println("---SENDING MESSAGE----------------");
		template.convertAndSend("DemoExchange", "CTT.BOOT", message);
	}

}
