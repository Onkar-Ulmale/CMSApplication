package com.app.customer;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	@SuppressWarnings("unused")
	private double mincharges;
	
	
	ServicePlan(double mincharges)
	{
		this.mincharges=mincharges;
	}

	
	public double getmincharges()
	{
		return mincharges;
	}

}
