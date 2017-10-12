import java.util.Arrays;

//Lab11 Assignment
//Author: Hayden Lingle
//Date: Oct 3, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab11 {
	
	public static double arrayAverage(double[] receivedArray){
		double total = 0.0;
		for(int i = 0; i < receivedArray.length; i++){
			total += receivedArray[i];
		}
		
		return (total/receivedArray.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};
		int[] numbers = {12, 42, 33, 67, 92, 58, 33};
		String[] arguments = new String[9];
		
		System.out.println("Length of grades: " + grades.length);
		System.out.println("Length of numbers: " + numbers.length);
		System.out.println("Length of arguments: " + arguments.length);
		
		System.out.println("First element of grades: " + grades[0]);
		System.out.println("Third element of grades: " + grades[2]);
		System.out.println("Last element of numbers: " + numbers[numbers.length-1]);
		
		grades[grades.length-2] = 90.5;
		numbers[2] = 99;
		for(int i = 0; i < arguments.length; i++){
			if(i < 6){
				arguments[i] = "Java";
			}
			else{
				arguments[i] = "C++";
			}
		}//end for
		
		for(int i = 0; i < grades.length; i++){
			System.out.print(grades[i] + ", ");
		}
		System.out.println("");
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + ", ");
		}
		System.out.println("");
		
		for(int i = 0; i < arguments.length; i++){
			System.out.print(arguments[i] + ", ");
		}
		System.out.println("");
		
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguments));
		
		System.out.println("Average of grades array: " + arrayAverage(grades));
		
		
	}

}
