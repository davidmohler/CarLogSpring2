package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Vehicle;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Vehicle vehicle() {
		Vehicle bean = new Vehicle("Alexa");
		return bean;
	}
}
