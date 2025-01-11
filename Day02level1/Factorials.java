import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //  the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = sc.nextInt(); // Read the user input

        // Check if the number is a natural number (positive integer)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; // Exit if the number is negative
        }

        // Initialize the factorial variable to 1
        long factorial = 1;

        // Use a for loop to compute the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by i at each iteration
        }

        // Print the factorial result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner to free resources
        sc.close();
    }
}