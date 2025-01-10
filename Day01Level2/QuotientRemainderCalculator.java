import java.util.*;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number (dividend)
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number (divisor)
        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();

        // Check if the divisor is zero to avoid division by zero
        if (number2 == 0) {
            // Print a message if division by zero is attempted
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculate the quotient using integer division
            int quotient = number1 / number2;

            // Calculate the remainder using the modulus operator
            int remainder = number1 % number2;

            // Print the result in a formatted manner
            System.out.print("The Quotient is "+ quotient + "and Remainder is "+ remainder +" of two numbers "+ number1 +" and "+number2); 
                              
        }

        // Close the scanner to release resources
        sc.close();
    }
}