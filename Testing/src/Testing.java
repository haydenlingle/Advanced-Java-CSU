//Testing Assignment
//Author: Hayden Lingle
//Date: Oct 3, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu


public class Testing {
	
	public static boolean method10(int x){
	    for(int i=2;i<x;i++){
	       if(x%i==0){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(method10(7));
	}

}
