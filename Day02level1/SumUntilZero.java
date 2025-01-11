
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total sum to 0.0
        double total = 0.0;

        // Variable to store the user input
        double input;

        // Loop until the user enters 0
        do {
            // the user to enter a number
            System.out.print("Enter a number (or 0 to stop): ");
            input = sc.nextDouble(); // Read the user input

            // If the input is not 0, add it to the total
            if (input != 0) {
                total += input; // Update the total
            }
        } while (input != 0); // Continue the loop until the input is 0

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner to free resources
        sc.close();
    }
}

