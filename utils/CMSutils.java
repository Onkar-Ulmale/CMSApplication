package com.app.utils;

import java.util.List;

import com.app.Customer.Customer;
import com.app.custom_exception.CMSException;

public class CMSutils {

	public static Customer loginTheCustomer(String e, String p, List<Customer> list) throws CMSException {
		Customer cust=new Customer(e);
		int index=list.indexOf(cust);
		if(index==-1)
		{
			throw new CMSException("Invalid E,mail !!!!");
		}
		Customer customer=list.get(index);
		if (customer.getPassword().equals(p))
		{
			return customer;
		}
		throw new CMSException("Invalid Password !!!!!");
	}

	public static String deleteCustomer(String email, List<Customer> customerList) throws CMSException
	{

		int index=customerList.indexOf(new Customer(email));
		if(index ==-1)
			throw new CMSException("Invalid Email!!!!");
		
		
		return "Removed Details of "+customerList.remove(index).getFirstName();
	}

	

}
