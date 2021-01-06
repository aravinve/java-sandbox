package oop;

public class User {
	
	private String firstName;
	private String lastName;
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void sayHello() {
		System.out.println("Hello, " + this.firstName + this.lastName);
	}

}
