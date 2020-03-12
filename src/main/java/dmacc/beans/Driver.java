package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Driver {
	private String firstName;
	private String lastName;
	private Integer age;
		
	public Driver() {
		super();
	}
	public Driver(String firstName, String lastName, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
