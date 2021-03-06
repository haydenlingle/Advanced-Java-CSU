import java.util.Scanner;

//Lab4 Assignment
//Author: Hayden Lingle
//Date: Aug 31, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu

public class Lab4 {

	public static void main(String[] args) {
		//Prints 15, -7.5, 12.0 respectively
		
		// Operator precedence, integer math
	    //System.out.println(2 - 23 % 10 + 3 * 12 - 20);

	    // Operator precedence, floating-point math
	    //System.out.println(2.4 + 23.1 - 10.0 * 3.1 - 12.5 / 6.25);
	  
	    // Operator precedence, mixed math
	    //System.out.println(65 % 15 + 3.5 * (5 / 2));
		
		int A, B, C;
		double positiveRoot = 0.0;
		double negativeRoot = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		A = scan.nextInt();
		
		System.out.print("Enter coefficient B: ");
		B = scan.nextInt();
		
		System.out.print("Enter coefficient C: ");
		C = scan.nextInt();
		
		System.out.println("Formula: " + A + "x^2 + " + B + "x + " + C);
		
		positiveRoot = ((-1*B + Math.sqrt((double)Math.pow(B, 2) - (4.0 * A * C)))/2);
		negativeRoot = ((-1*B - Math.sqrt((double)Math.pow(B, 2) - (4.0 * A * C)))/2);
		
		System.out.printf("Positive root: %.1f\n", positiveRoot);
		System.out.printf("Positive root: %.1f", negativeRoot);	    

	}

}
