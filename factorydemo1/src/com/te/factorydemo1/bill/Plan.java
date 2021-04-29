package com.te.factorydemo1.bill;

public abstract class Plan {
	protected double rate;  
	abstract void setRate();  

	public float generateBill(float units){  
		return  (float) (units*rate); 
	}
}
