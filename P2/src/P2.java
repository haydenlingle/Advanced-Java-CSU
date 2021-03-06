// P2 Assignment
// Author: Hayden Lingle
// Date: Aug 29, 2017
// Class: CS164
// Email: hlingle@rams.colostate.edu

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		double radius, circumference, area, volume;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Radius? ");
		radius = scan.nextDouble();
		
		circumference = radius * 2.0 * Math.PI;
		area = (Math.PI * Math.pow(radius, 2));
		volume = (Math.PI*Math.pow(radius, 3)) * (4.0/3.0);
		
		System.out.printf("The circumference is %.5f.", circumference);
		System.out.println();
		System.out.printf("The area is %.5f.", area);
		System.out.println();
		System.out.printf("The volume is %.5f.", volume);
		System.out.println();

		double energy, mass;
		double speedOfLight = 299792458.0;
		System.out.print("Mass? ");
		mass = scan.nextDouble();
		energy = mass * Math.pow(speedOfLight, 2);
		System.out.printf("The energy is %.1f joules.", energy);
		scan.close();
		int main = 4;
		
		
	}

}
