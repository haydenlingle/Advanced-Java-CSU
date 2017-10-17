//Q2 Assignment
//Author: Hayden Lingle
//Date: Oct 15, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Pseudo {

	public static char charAt(char[] charArray, int index){		
		return charArray[index];
	}
	
	public static int indexOf(char[] charArray, char findThis){		
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] == findThis){
				return i;
			}//end if
		}//end for
		return -1;
	}//end indexOf
	
	public static String toUpperCase(char[] charArray){
		String newString = "";
		for(int i = 0; i < charArray.length; i++){
			newString += Character.toUpperCase(charArray[i]);
		}
		return newString;
	}
	

	public static void main(String[] args) {
		// Verify class
		 char[] test = {'1', '2', '3', '4', '5', '6', '7', '8', '9','0', ' ', 'C','o','m','p','u','t','e','r', ' ', 'S','c','i','e','n','c','e', ' ','!','(', '*', '@', '&', '#', ')', '*'};

		 System.out.println("Verifying Pseudo:");

		 System.out.println("charAt(test,5) = " + charAt(test,5));
		 System.out.println("indexOf(test,'C') = " + indexOf(test,'C'));
		 System.out.println("toUpperCase(test) = " + toUpperCase(test));

		 // String equivalent (should match!)
		 System.out.println("\nComparing String:");
		 String string = "1234567890 Computer Science !(*@&#)*";
		 System.out.println("string = " + string);
		 System.out.println("string.charAt(5) = " + string.charAt(5));
		 System.out.println("string.indexOf('C') = " + string.indexOf('C'));
		 System.out.println("string.toUpperCase() = " + string.toUpperCase());

	}
}
