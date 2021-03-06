//Lab6 Assignment
//Author: Hayden Lingle
//Date: Sep 12, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab6 {

	public static void main(String[] args) {
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		System.out.println(myString0 + " " + myString1 + " " + myString2 + ".");
		
		int length1 = myString0.length();
		int length2 = myString1.length();
		int length3 = myString2.length();
		
		int totalLength = length2 + length3;
		
		System.out.println("Total length of myString1 + myString2: " + totalLength);
		
		System.out.println("2nd char: " + myString1.charAt(1) + ", 4th char: " + myString1.charAt(3) + ", 7th char: " + myString1.charAt(6));
		
		System.out.println("Index of 'a': " + myString0.indexOf('a'));
		
		System.out.println("Uppercase myString2: " + myString2.toUpperCase());
		
		System.out.println("myString1 substring: " + myString1.substring(2, 8));
		
		String myString3 = new String("Whatever!");
		String myString4 = new String("Whatever!");
		
		System.out.println("Comparison w/==: " + (myString3 == myString4));
		System.out.println("Comparison w/.equals(): " + myString3.equals(myString4));
		
		char c0 = '^';
		char c1 = 'G';
		char c2 = '7';
		
		System.out.println(c0 + ";" + c1 + ";" + c2);
		System.out.println((int)c0 + ";" + (int)c1 + ";" + (int)c2);
	}

}
