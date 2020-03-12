package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Driver;
import dmacc.beans.Vehicle;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.VehicleRepository;

@SpringBootApplication
public class CarLogSpring2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CarLogSpring2Application.class, args);
			
	}
	@Autowired
	VehicleRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		//Using an existing bean
		Vehicle v = appContext.getBean("vehicle", Vehicle.class);
		v.setMake("Toyota");
		v.setModel("Corrolla");
		v.setYear(2015);
		repo.save(v);
		
		//Create a bean to use - not managed by Spring
		Vehicle v2 = new Vehicle("Ford", "Focus", 2014);
		Driver d = new Driver ("Sarah", "Smith", 35);
		v2.setDriver(d);
		repo.save(v2);
		
		List<Vehicle> allMyVehicles = repo.findAll();
		for(Vehicle garage: allMyVehicles) {
			System.out.println(garage.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
		
	}
}
