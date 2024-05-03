package com.app.customer;

import java.time.LocalDate;

public class CustomerClass {

	private int id;
	private String firstName,lastName,email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private int counter=1;
	
	
	public CustomerClass(String firstName,String lastname,String email,String password,double registrationAmmout,LocalDate dob,ServicePlan plan) 
	{
		this.id=counter;
		counter++;
		this.firstName=firstName;
		this.lastName=lastname;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmmout;
		this.dob=dob;
		this.plan=plan;
	}
	public CustomerClass(String email)
	{
		this.email=email;
	}


	@Override
	public String toString() {
		return "CustomerClass id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + ", counter=" + counter ;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof CustomerClass)
		{
			return this.email == ((CustomerClass)o).email;
		}
		return false;
	}
	
}
