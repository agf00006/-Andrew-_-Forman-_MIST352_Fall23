import java.util.Scanner;

/**
 * 
 */

/**
 * 
 */
public class Exam1B_ChatGPT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Greet the user
        System.out.println("Welcome! Please enter a text:");

        // Read the user's input as a string
        String userInput = scanner.nextLine();

        // Print the length of the input
        System.out.println("The length of your input is: " + userInput.length());

        // Ask the user for a character
        System.out.print("Now, please enter a character from the previous input: ");
        char userChar = scanner.next().charAt(0); // Read the first character of the input

        // Find and print the location of the character within the input
        int charIndex = userInput.indexOf(userChar);
        if (charIndex != -1) {
            System.out.println("The character '" + userChar + "' is found at index " + charIndex);
        } else {
            System.out.println("The character '" + userChar + "' is not found in the input.");
        }

        // Close the scanner
        scanner.close();
    }








	}


