package com.app.tester;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import com.app.Customer.Customer;
import com.app.utils.*;
import com.app.utils.Customervalidation;

public class CMSApplication {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = new ArrayList<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1. Customer Sign Up 2. Display all 3 LogIn 0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = Customervalidation.validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						break;
					case 2:
						for(Customer c: customerList)
						{
							System.out.println(c);
						}
						
						break;
					case 3:
						System.out.println("Enter email and password::");
						String e=sc.next();
						String p=sc.next();
						customer=CMSutils.loginTheCustomer(e, p, customerList);
						System.out.println("Login Sucessfull !!!!");
						System.out.println(customer);
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}
			}
		}
		
	}

}
