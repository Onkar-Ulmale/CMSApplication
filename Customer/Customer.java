package com.app.Customer;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName,lastName,email;
	private String password;
	private  double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int counter=1;

	public Customer( String firstName, String lastName, String email, String password, double regAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.id = counter;
		counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	public Customer(String email)
	{
		this.email=email;
	}
	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}
	

}
