import java.util.Scanner;

public class CircleOfLife{

	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		Species sObject = new Species("Labrador Retriever", 100, 10);
		Species sObject1 = new Species("Pug", 1200, 10);
		
		System.out.println(sObject);
		sObject.mergeSpecies(sObject1);
		
		int inputYears;		
		System.out.print("Enter number of years: ");
		inputYears = scnr.nextInt();
		System.out.println("Total population after " + inputYears + " years: " + Math.round(sObject.populationInXYears(inputYears)));
		
		scnr.close();
				
    }
}
