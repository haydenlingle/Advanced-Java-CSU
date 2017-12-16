import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Testing Assignment
//Author: Hayden Lingle
//Date: Oct 3, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu


public class Testing {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<Integer>(10);
		System.out.println(iList.size());
		iList.add(3);
		iList.add(4);
		iList.remove(0);
		iList.add(5);
		System.out.println(iList.toString());
	
//		try{
//			Scanner fileScnr = new Scanner(new File("input.txt"));
//			String line;
//			while (fileScnr.hasNextLine()){
//				line = fileScnr.nextLine();
//				Scanner lineScnr = new Scanner(line);
//				while(lineScnr.hasNext()){
//					System.out.println(lineScnr.next());
//				}
//			}
//			
//			PrintWriter writer = new PrintWriter(new File("output.txt"));
//			writer.print("Hello");
//		}catch(IOException e){
//			System.out.println("error: " + e);
//		}
	
		
	}
	

}
