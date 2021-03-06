//Lab9 Assignment
//Author: Hayden Lingle
//Date: Sep 28, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab9 {
	
	public static double circleArea(double radius){		
		double area = Math.PI * Math.pow(radius, 2.0);		
		return area;
	}
	
	public static double sphereVolume(double radius){
		double volume = Math.PI * (4.0/3.0) * Math.pow(radius, 3.0);
		return volume;
	}
	
	public static double round(double num){
		num = Math.floor(num + 0.5);
		return num;
	}
	
	public static String reverse(String initialString){
		String newString = "";
		for(int i = 0; i < initialString.length(); i++){
			if(Character.isLowerCase(initialString.charAt(i))){
				newString += Character.toUpperCase(initialString.charAt(i));
			}else{
				newString += Character.toLowerCase(initialString.charAt(i));
			}
		}
		
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(circleArea(2.0));
		System.out.println(sphereVolume(2.0));
		System.out.println(round(3.488821));
		System.out.println(reverse("ThEy DoNt CaLl U tHaT"));

	}

}
