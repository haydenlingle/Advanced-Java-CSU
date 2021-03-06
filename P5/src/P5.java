import java.util.Scanner;

//P5 Assignment
//Author: Hayden Lingle
//Date: Sep 21, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu


public class P5 {
	
	// Method to check whether an integer is prime.
	public static boolean isPrime(int number) {

	    // DO NOT CHANGE THIS CODE!
	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	            return false;
	    return true;
	}

	// Method to print primes in a specified range
	public static void printPrimes(int start, int end) {
	    for(int i = start; i <= end; i++){
	    	if(isPrime(i)){
	    		System.out.print(i + ", ");
	    	}
	    }//end for
	    System.out.println();
	}

	// Method to remove vowels from a string
	public static String removeVowels(String input) {
	    
		String finalString ="";
	    for(int i = 0; i < input.length(); i++){
	    	switch(input.charAt(i)){
	    	case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
	    		break;
	    	default:
	    		finalString += input.charAt(i);
	    	}//end switch	    	
	    }
		return finalString;
	}

	// Method to generate and print the value of a number raised to an exponent
	public static double evaluateExponent(double number, int exponent) {
	    double result = 1.0;
	    if(exponent < 0.0 + 0.0001 && exponent > 0.0 - 0.0001){
	    	return result;
	    }
	    else{
	    	int loop = 0;
	    	do{
	    		result *= number;
	    		loop++;
	    	}while(loop != exponent);
	    	return result;
	    }//end else
	}

	// Method to find and print the minimum/maximum/mean of a set of positive numbers
	public static void computeStatistics(int sentinel) {
	    Scanner scnr = new Scanner(System.in);
	    int value = 0, count = 0, minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
	    double mean = 0.0;
	    
	    while(value != sentinel){
	    	value = scnr.nextInt();
	    	
	    	if(value == -1){
	    		break;
	    	}
	    	
	    	if(value > maximum){
	    		maximum = value;
	    	}
	    	if(value < minimum){
	    		minimum = value;
	    	}
	    	
	    	mean += value;
	    	count++;
	    }//end while
	    
	    mean /= count;
	    System.out.println("Count: " + count);
	    System.out.println("Average: " + mean);
	    System.out.println("Maximum: " + maximum);
	    System.out.println("Minimum: " + minimum);
	}

	public static void main(String[] args) {
		// Preliminary testing
	    printPrimes(1, 50);
	    System.out.println(removeVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	    double result = evaluateExponent(2.0,16);
	    System.out.println("2.0 to the 16 = " + result);
	    computeStatistics(-1);
	}

}
