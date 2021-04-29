package com.te.factorydemo1.bill;

public class GetPlan {

	public static Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
		}  
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
			return new DomesticPlan();  
		}   
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
			return new CommercialPlan();  
		}   
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
			return new InstitutionalPlan();  
		}  
		return null;  
	}  
}
