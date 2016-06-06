//U10416030 陳子勤

import java.util.*;
import java.math.*;

public class NumberPr{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String number1;
		String number2;
		int action;	//to decide what user want to do
		
		System.out.println("Enter number1: ");
		number1 = input.next();
		
		System.out.println("Enter number2: ");
		number2 = input.next();

		Number number = new Number(number1,number2);
		
		System.out.println("Choose an action:(1 to plus, 2 to subtract, 3 to multiply, 4 to divide)");
		action = input.nextInt();
		
		System.out.println("Result: " + number.calculate(action));
	}
}

class Number {
	BigDecimal number1;
	BigDecimal number2;
	
	Number(String a, String b) {
		number1 = new BigDecimal(a);
		number2 = new BigDecimal(b);
	}
	
	//calculate and return result
	String calculate(int action){
		String result = "";
		if(action == 1)
			result = String.valueOf(number1.add(number2));				
		else if(action == 2)
			result = String.valueOf(number1.subtract(number2));
		else if(action == 3)
			result = String.valueOf(number1.multiply(number2));
		else if(action == 4)			
			result = String.valueOf(number1.divide(number2, 5, BigDecimal.ROUND_HALF_UP));
		else
			result = "ERROR";
		return result;
	}
}

