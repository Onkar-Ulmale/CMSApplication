package com.app.utils;

import com.app.Customer.Customer;
import com.app.Customer.ServicePlan;
import com.app.custom_exception.CMSException;

import java.time.LocalDate;
import java.util.List;
//to validate that the new email id entered is unique or not 
public class Customervalidation {
	public static void checkForDubCustomer(String email,List<Customer> customerList)throws CMSException
	{
		Customer NewCust=new Customer(email);
		if(customerList.contains(NewCust))
		{
			throw new CMSException("Email Id Already Used !!!");
		}
		
	}
	
//	check weather plan is valid or not and Registration amount must match with the plan
	public static ServicePlan validatePlanAndCharges(String Plan,double regAmt)throws CMSException
	{
		ServicePlan serviceplan=ServicePlan.valueOf(Plan.toUpperCase());
		if(serviceplan.getPlanCost()==regAmt)
		{
			return serviceplan;
			
		}
		throw new CMSException("Reg Amount Doesn't match!!!!");
	}
	// add a method to validate all i/p s
	public static Customer validateInputs(String firstName, String lastName, String email, String password, double regAmount,
			String dob, String plan,List<Customer> customers)throws CMSException
	{
		checkForDubCustomer(email, customers);
		ServicePlan serviceplan = validatePlanAndCharges(plan, regAmount);
		LocalDate birthdate = LocalDate.parse(dob);
		return new Customer( firstName,  lastName,  email,  password,  regAmount, birthdate,  serviceplan);
	}
	


}
