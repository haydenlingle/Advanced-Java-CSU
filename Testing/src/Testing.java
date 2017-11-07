import java.util.ArrayList;

//Testing Assignment
//Author: Hayden Lingle
//Date: Oct 3, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu


public class Testing {
	
	public static void rec1(int i){
		if(i == 0)
			System.out.println(i + " ");
		for(int j = 0; j < 2; j++){
			rec1(i-1);
			rec1(i-1);
		}
	}
	
	public static void main(String[] args) {
		rec1(1);
	}
	

}
