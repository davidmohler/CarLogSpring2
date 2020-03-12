package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String make;
	private String model;
	private Integer year;
	@Autowired
	private Driver driver;
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(String make) {
		super();
		this.make = make;
	}

	public Vehicle(String make, String model, Integer year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Vehicle(long id, String make, String model, Integer year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;		
	}
	
	public Vehicle(long id, String make, String model, Integer year, Driver driver) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", driver=" + driver
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}	
}
