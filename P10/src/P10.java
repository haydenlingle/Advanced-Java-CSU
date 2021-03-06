import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

//P10 Assignment
//Author: Hayden Lingle
//Date: Nov 5, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class P10 implements Interface {

	

	@Override
	public Temperature[] readTemperatures(String filename) {
		
		try {
			File f = new File(filename);
			Scanner scnr = new Scanner(f);
			//check how many entries
			
			int locationInArray = 0;
			
			int lengthOfArray = 0;
			
			
			lengthOfArray = scnr.nextInt();
			Temperature[] newList = new Temperature[lengthOfArray];
			
			do{
				String date = scnr.next();
				String hour = scnr.next();
				double degrees = scnr.nextDouble();
				double speed = scnr.nextDouble();

				newList[locationInArray] = new Temperature(date, hour, degrees, speed);
				locationInArray++;
				
			}while(locationInArray < lengthOfArray);		
			
			return newList;
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public double findMinimum(Date start, Date end, Temperature[] data) {
		double minTemp = Double.MAX_VALUE;
		for(int i = 0; i < data.length; i++){
			if(data[i].temperature < minTemp && data[i].inInterval(start, end)){				
				minTemp = data[i].temperature;
			}
		}
		return minTemp;
	}

	@Override
	public double findMaximum(Date start, Date end, Temperature[] data) {
		double maxTemp = Double.MIN_VALUE;
		for(int i = 0; i < data.length; i++){
			if(data[i].temperature > maxTemp && data[i].inInterval(start, end)){				
				maxTemp = data[i].temperature;
			}
		}
		return maxTemp;
	}

	@Override
	public double findAverage(Date start, Date end, Temperature[] data) {
		double avgTemp = Double.MIN_VALUE;
		int count = 0;
		for(int i = 0; i < data.length; i++){
			if(data[i].inInterval(start, end)){				
				avgTemp += data[i].temperature;
				count++;
			}
		}
		return avgTemp/count;
	}

	@Override
	public double findHighest(Date start, Date end, Temperature[] data) {
		double highSpeed = Double.MIN_VALUE;
		for(int i = 0; i < data.length; i++){
			if(data[i].windspeed > highSpeed && data[i].inInterval(start, end)){				
				highSpeed = data[i].windspeed;
			}
		}
		return highSpeed;
	}

	public static void main(String[] args) {
		// Instantiate student code
	    P10 p10 = new P10();
	    
	    // Test readTemperatures
	    Temperature[] data = p10.readTemperatures(args[0]);
	    
	    // Test findMinimum
	    Date start = Temperature.createDate("04-Jul-2008", "06:00");
	    Date end = Temperature.createDate("17-Aug-2010", "23:00");
	    System.out.println("Verifying findMinimum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Minimum = %.1f degrees\n", p10.findMinimum(start, end, data));

	    // Test findMaximum 
	    start = Temperature.createDate("19-Sep-2011", "07:00");
	    end = Temperature.createDate("23-Mar-2015", "13:00");
	    System.out.println("Verifying findMaximum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Maximum = %.1f degrees\n", p10.findMaximum(start, end, data));

	    // Test findAverage
	    start = Temperature.createDate("09-Apr-2006", "19:00");
	    end = Temperature.createDate("31-Oct-2013", "10:00");
	    System.out.println("Verifying findAverage method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Average = %.1f degrees\n", p10.findAverage(start, end, data));

	    // Test findHighest
	    start = Temperature.createDate("01-Jan-2015", "00:00");
	    end = Temperature.createDate("31-Dec-2015", "23:00");
	    System.out.println("Verifying findHighest method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Highest windspeed = %.1f\n", p10.findHighest(start, end, data));

	}
}
