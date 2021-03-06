import java.util.Scanner;

//P4 Assignment
//Author: Hayden Lingle
//Date: Sep 14, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu

public class P4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Variable Declaration
		double grossSalary, interestIncome, capitalGains, totalIncome, adjustedIncome, federalTax, stateTax;		
		int numExemptions;
		
		System.out.print("Salary: ");
		grossSalary = scnr.nextDouble();
		
		System.out.print("Exemptions: ");
		numExemptions = scnr.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = scnr.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = scnr.nextDouble();
		
		totalIncome = grossSalary + interestIncome + capitalGains - 5000.0;
		
		if(numExemptions > 6){
			numExemptions = 6;
		}
		
		adjustedIncome = totalIncome - ((double)numExemptions * 1500.0);
		
		stateTax = adjustedIncome * .065;
		
		double taxAmount1 = 1950.0, taxAmount2 = 3450.0, taxAmount3 = 0.0;
		
		
		if(adjustedIncome >= 50000.0){
			taxAmount3 = (adjustedIncome - 50000.0) * .28;
			federalTax = taxAmount3 + taxAmount2 + taxAmount1;
		}
		else if(adjustedIncome >= 35000.0){
			taxAmount2 = (adjustedIncome - 35000.0) * .23;
			federalTax = taxAmount2 + taxAmount1;
		}
		else if(adjustedIncome >= 20000.0){
			taxAmount1 = (adjustedIncome - 20000.0) * .13;
			federalTax = taxAmount1;
		}
		else{
			federalTax = 0.0;
		}
		
		System.out.printf("Total Income: $%.2f\n", totalIncome);
		System.out.printf("Adjusted Income: $%.2f\n", adjustedIncome);
		
		System.out.printf("Total Tax: $%.2f\n", federalTax );
		System.out.printf("State Tax: $%.2f\n", stateTax);
		
		
		
		
		
	}

}
