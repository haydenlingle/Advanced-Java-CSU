import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Lab16 Assignment
//Author: Hayden Lingle
//Date: Nov 7, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab16 {
	
	public void readFile( String inputFile ){
		
		try {
			Scanner scan = new Scanner(new File(inputFile));
			while (scan.hasNext()){
				if(scan.hasNextDouble()){
					System.out.println("Double: " + scan.nextDouble());
				}
				else if(scan.hasNextInt()){
					System.out.println("Integer: " + scan.nextInt());
				}
				else{
					System.out.println("String: " + scan.next());
				}
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile( String outputFile ){
		
		try {
			
			
			PrintWriter output = new PrintWriter(new File(outputFile));
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Enter text:");
			
			String userInput = "";
			
			while(! userInput.equals("stop")){
				
				userInput = scnr.nextLine();
				if(! userInput.equals("stop")){
					//															2System.out.println("ADDING: " + userInput);
					output.println(userInput);
				}
				
			}
			
			scnr.close();
			output.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Lab16 newlab = new Lab16();
		
		newlab.readFile(args[0]);
		
		
		newlab.writeFile(args[1]);
		
		
		
	}

}
