//Lab7 Assignment
//Author: Hayden Lingle
//Date: Sep 19, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab7 {
	
	public static void reverseString(String s) {
	    char letter;
		for(int i = s.length() - 1; i>=0; i--){
	    	letter = s.charAt(i);
	    	System.out.print(letter);
	    }
		System.out.println("");
	}

	public static void printAscii(char start, char end) {
	    for(char i = start; i <= end; i++){
	    	System.out.println((int)i + ": " + i);
	    }
	}

	public static double raiseToPower(double number, int exponent) {
	    double finalNum = 0.0;
	    finalNum = Math.pow(number, exponent);
	    return finalNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Hello");
		printAscii('i','o');
		System.out.println(raiseToPower(4, 2));
	}

}
