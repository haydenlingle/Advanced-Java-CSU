//Lab5 Assignment
//Author: Hayden Lingle
//Date: Sep 7, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu

import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// TODO Auto-generated method stub
		boolean boolean0 = true;
		boolean boolean1 = false;
		
		System.out.println("boolean0 is " + boolean0);
		System.out.println("boolean1 is " + boolean1);
		
		//Comparison Operators
		
		boolean equals = (11 == 33);
		boolean notEquals = (22 != 44);
		boolean greaterThan = (15 > 25);
		boolean lessThan = (-11 < 13);
		
		System.out.println("(11 == 33) is " + equals);
		System.out.println("(22 != 44) is " + notEquals);
		System.out.println("(15 > 25) is " + greaterThan);
		System.out.println("(-11 < 13) is " + lessThan);
		
		int integer0, integer1;
		
		System.out.print("Enter first integer: ");
		integer0 = scnr.nextInt();
		
		System.out.print("Enter second integer: ");
		integer1 = scnr.nextInt();
		
		if(integer0 > integer1){
			System.out.println("First integer is larger than the second.");
		}
		else if(integer0 < integer1){
			System.out.println("Second integer is larger than the first.");
		}
		else {
			System.out.println("Both integers are equal.");
		}
		
		String myString;
		System.out.print("Enter a state: ");
		myString = scnr.next();
		
		switch (myString) {
			case "Alabama": case "Florida": System.out.println("Southern State"); break;
			case "Utah": case "Colorado": System.out.println("Western State"); break;
			case "Michigan": case "Wisconsin": System.out.println("Northern State"); break;
			case "Delaware": case "Maine": System.out.println("Eastern State"); break;
			default: System.out.println("Not sure where that is, must be in Midwest!");
		}
		
		
	}

}