//Lab18 Assignment
//Author: Hayden Lingle
//Date: Nov 9, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Lab18 implements IR18{
	
	public String reverseString(String word){
		if(word.length() == 0){
			return "";
		}
		return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
	}

	@Override
	public String starString(int x) {		
		if(x == 0){
			return "";
		}
		return "*" + starString(x-1);
	}

	@Override
	public void starPattern(int x) {//will call a line printer # times
		if(x == 0){
			return;
		}else{
			System.out.println(starString(x));
			starPattern(x - 1);
		}		
	}

	@Override
	public boolean palindrome(String word) {
		if(reverseString(word).equals(word)){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Lab18 l18 = new Lab18();
		l18.starPattern(4);
		System.out.println(l18.palindrome("racecar"));


	}

}
