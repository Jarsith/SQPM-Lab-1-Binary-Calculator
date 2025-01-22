package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner; // Import the scanner class for user input

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will perform binary operations (AND, OR, Multiply, Add) on two binary numbers, and print the results
	*
	*/
    public static void main( String[] args )
    {
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

		// Print the current local time
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		// Ask the user to enter the first binary number
		System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();

		// Ask the user to enter the second binary number
		System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();

		// Create binary objects from user input
        Binary binary1 = new Binary(binary1Input);
        Binary binary2 = new Binary(binary2Input);

		// Display the entered binary numbers
        System.out.println( "First binary number is "+binary1.getValue());
		System.out.println( "Second binary number is "+binary2.getValue());

		// Perform the Add operation and display the result
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());

		// Peform the OR oepration and display the result
		Binary orResult = Binary.or(binary1, binary2);
        System.out.println("The result of OR operation is: " + orResult.getValue());

		// Perform the AND operation and display the result
        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("The result of AND operation is: " + andResult.getValue());

		// Perform the Multiply operation and display the result
        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("The result of multiplication is: " + multiplyResult.getValue());

		// Close the scanner to avoid resource leak
		scanner.close();
    }
}
