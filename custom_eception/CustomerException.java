package com.app.custom_eception;

@SuppressWarnings("serial")

public class CustomerException extends Exception {

	public CustomerException(String mesg) {
		super(mesg);
	}
}
