import java.util.ArrayList;

//P11 Assignment
//Author: Hayden Lingle
//Date: Nov 12, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class P11 implements IP11{

	public static void main(String[] args) {

	}
	
	public String linePrinter(int numDash, int numStar){
		if(numDash == -1){
			return "";
		}else{
			System.out.println(starPrinter(numStar) + dashPrinter(numDash));
			return linePrinter(numDash - 1, numStar + 1);
		}
	}
	
	public String starPrinter(int n){
		if(n == 0){
			return "";
		}else{
			return "*" + starPrinter(n -1);
		}
	}
	
	public String dashPrinter(int n){
		if(n == 0){
			return "";
		}else{
			return "-" + dashPrinter(n - 1);
		}
	}

	@Override
	public void printPattern(int n) {
		linePrinter(n, 0);
	}
	
	public int helperConvertNum(int index, int[] num){
		if(index == num.length){
			return 0;
		}
		
		
		return ((int)Math.pow(10, num.length - index - 1) * num[index]) + helperConvertNum(index + 1, num);
	}

	@Override
	public int convertNum(int[] num) {
		return helperConvertNum(0, num);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void helperIntersect(int n, ArrayList<String> NEW, ArrayList<String> AL1, ArrayList<String> AL2){
		if(n == AL1.size()){
			return;
		}
		else{
			if(AL2.contains(AL1.get(n))){
				
				NEW.add(AL1.get(n));				
			}
			helperIntersect(n+1, NEW, AL1, AL2);
		}
	}
	
	
	

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		ArrayList<String> newArrayList = new ArrayList<String>();
		helperIntersect(0, newArrayList, AL1, AL2);
		return newArrayList;
	}

}
