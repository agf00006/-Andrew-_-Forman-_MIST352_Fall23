/**
 * 
 */
import java.util.Scanner;
/**
 * Author: Andy Forman
 * Class: MIST352-Fall23
 * HW#1
 * Greets user and calculates sum of two numbers given by the user
 */
public class HW1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



System.out.println("Hi! This program calculates the sum of two numbers");
		System.out.println("Enter the value for Num1");
		Scanner keyboard = new Scanner (System.in);
		double dblNum1 = keyboard.nextDouble();
		System.out.println("Enter the value for Num2");
		double dblNum2 = keyboard.nextDouble();
		double dblSum = dblNum1 + dblNum2;
		System.out.println("The sum of " + dblNum1 + " and " + dblNum2 + " equals " + dblSum);
		keyboard.close();
		
		

		
	
		
		
		
		
		

	}

}
