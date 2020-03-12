package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Driver;
import dmacc.beans.Vehicle;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Vehicle vehicle() {
		Vehicle bean = new Vehicle("Alexa");
		return bean;
	}
	
	@Bean
	public Driver driver() {
		Driver bean = new Driver("Josh", "Jacobs", 25);
		return bean;
	}
	
}
