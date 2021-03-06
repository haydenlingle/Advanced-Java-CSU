//P3 Assignment
//Author: Hayden Lingle
//Date: Sep 5, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu

import java.util.Scanner;

public class P3 {

	public static String evaluate(String expression){
		Scanner scnr = new Scanner(expression);
		// Print expression
		//System.out.println(expression);
		
		double firstNum = 0.0;
		double secondNum = 0.0;
		String operator = "null";
		String test;
		double result = 0.0;
		
		
		boolean firstIsDouble = scnr.hasNextDouble();
		if(firstIsDouble){
			firstNum = scnr.nextDouble();
		}else{
			return "Invalid Operand!";
		}
		
		boolean hasOperator = scnr.hasNext();
		if(hasOperator){//Has an operator, check it to make sure it's good
			
			test = scnr.next();
			
			switch(test){
			case "+": case "-": case "*": case "/": case "%": case "^": {//operator is good
				operator=test;//assign operator to variable
			} break;
			default: {return "Invalid Operator!";}
			}//end switch
			
			
		}else{
			return "No Operator!";
		}
		
		
		boolean secondIsDouble = scnr.hasNextDouble();
		
		if(secondIsDouble){
			secondNum = scnr.nextDouble();
		}else{
			return "Invalid Operand!";
		}
		
		
		if(operator != "null" && firstIsDouble && secondIsDouble){//if operator is good and has been set and if there is a number in first and second double then do calculation
			switch(operator){
				case "+": result = firstNum + secondNum; break;
				case "-": result = firstNum - secondNum; break;
				case "*": result = firstNum * secondNum; break;
				case "/": result = firstNum / secondNum; break;
				case "%": result = firstNum % secondNum; break;
				case "^":result = Math.pow(firstNum, secondNum); break;
			}
		}
		
		//System.out.println("firstNum: " + firstNum + ", secondNum: " + secondNum + ", operator: " + operator + ", result: " + result);
		
		
		
		
		String returnString = Double.toString(result);
			
		return returnString;
	}

}
