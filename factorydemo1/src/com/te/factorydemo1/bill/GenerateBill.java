package com.te.factorydemo1.bill;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type ");
		String planName=sc.next();
		System.out.println("Enter units ");
		int units = sc.nextInt();
		
		 Plan p = GetPlan.getPlan(planName);  
		 p.setRate();
		 System.out.println("Total Bill is "+p.generateBill(units));

	}

}
