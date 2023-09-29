import java.util.Scanner;

/**
 * Andrew Forman
 * 9/29/2023
 * Exam1B
 * Welcome user and accept text input. Print out length of provided input
 * and printout location of character given by user.
 */

/**
 * 
 */
public class Exam1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stringSize;
		int letterLocation;
		
System.out.println("Hello! Please enter your favorite thing!");
System.out.println("What is your favorite thing?");
Scanner keyboard = new Scanner (System.in);
String favoriteThing = keyboard.nextLine();
stringSize = favoriteThing.length();
System.out.println(favoriteThing + " has " + stringSize + " characters.");
System.out.println("What character should I find?");
String letter = keyboard.next();
letterLocation = favoriteThing.indexOf(letter);
System.out.println("The first occurance of the character " + letter + " is located at position " + 
letterLocation + " within " + favoriteThing);









	}



}
