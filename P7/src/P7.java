import java.util.Arrays;

//P7 Assignment
//Author: Hayden Lingle
//Date: Oct 9, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class P7 {
	
	public static int[] createIntegers(){
		int[] newArray = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		return newArray;
	}//end createIntegers
	
	public static double[] createDoubles(){
		double[] newArray = {Math.pow(10.0, 2), Math.pow(10.5, 2), Math.pow(11.0, 2), Math.pow(11.5, 2), Math.pow(12.0, 2), Math.pow(12.5, 2), Math.pow(13.0, 2)};
		return newArray;
	}//end createDoubles
	
	public static String[] createStrings(String stringPassed){
		String[] newArray = {stringPassed, stringPassed.toUpperCase(), stringPassed.toLowerCase(), stringPassed.substring(1)};
		return newArray;
	}//end createStrings
	
	public static char[] createChars(String stringPassed){
		char[] newArray = new char[stringPassed.length()];
		for(int i = 0; i < stringPassed.length(); i++){
			newArray[i] = stringPassed.charAt(i);
		}//end for
		return newArray;
	}//end createChars
	
	public static int sumArray(int[] intArray){
		int total = 0;
		for(int i = 0; i < intArray.length; i++){
			total += intArray[i];
		}//end for
		return total;
	}//end sumArray
	
	public static double findLargest(double[] doubleArray){
		double largest = Double.MIN_VALUE;
		for(int i = 0; i < doubleArray.length; i++){
			if (doubleArray[i] > largest){
				largest = doubleArray[i];
			}//end if
		}//end for		
		return largest;
	}//end findLargest
	
	public static int charFrequency(String[] stringArray, char characterToCount){
		int counter = 0;
		for(int i = 0; i < stringArray.length; i++){
			for(int j = 0; j < stringArray[i].length(); j++){
				if(stringArray[i].charAt(j) == characterToCount){
					counter++;
				}//end if
			}//end j for			
		}//end i for
		return counter;
	}//end charFrequency
	
	public static int[] translateChars(char[] charArray){
		int[] newIntArray = new int[charArray.length];
		for(int i = 0; i < charArray.length; i++){
			newIntArray[i] = (int)charArray[i];
		}//end for
		return newIntArray;
	}//end translateChars

	public static void main(String[] args) {
		// Create arrays
        int[] integerArray = createIntegers();
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = createDoubles();
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Hello There");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("Java1234!&");
        System.out.println(Arrays.toString(charArray));

        // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
	}

}
