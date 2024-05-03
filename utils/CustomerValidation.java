package com.app.utils;

import java.time.LocalDate;
import java.util.regex.Pattern;

import com.app.custom_eception.CustomerException;
import com.app.customer.CustomerClass;
import com.app.customer.ServicePlan;

public class CustomerValidation {
	
	public static CustomerClass ValidateInputs()throws CustomerException
	{
		
		return CustomerClass(firstName, lastname,email,password,registrationAmmout,dob,plan);
		
	}
	
	public static void checkForDub(String email,List<CustomerClass> customerList ) throws CustomerException
	{
		CustomerClass customer=new CustomerClass(email);
		if(customerList.contains(customer))
			throw new CustomerException("Email ID Already used !!!!!");
	}
	
	

	
	public static ServicePlan parseAndValidateServicePlan(String serviceplan)
	{
		return ServicePlan.valueOf(serviceplan.toUpperCase());
	}

	
	public static LocalDate parseDate(String date)
	{
		return LocalDate.parse(date);
		
	}
	
	
	public static void validateregistrationAmmount(ServicePlan plan,double registrationAmmout) throws CustomerException
	{
		if(registrationAmmout< plan.getmincharges())
			throw new CustomerException("Registration Ammount is Less !!! ");
		System.out.println("Valid Ammount ...");
		
	}
//	email must contain @ and it should end with either
//	.com | .org | .net
	public static void validateEmail(String email)throws CustomerException
	{
		 String regex = "*@* | [.net , .org ,.net]$";
		  return Pattern.matches(regex, email);
	}
	
//	password must be alphanumeric 
//	Hint : Use regular expression here.
//	regex="((?=.*\\d)(?=.*[a-z])(?=.*[#	@$*]).{5,20})"
	
	public static void validatePassword(String pass)throws CustomerException
	{
		String regex="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})"
		return Pattern.matches(regex, pass);
	}
	
}
