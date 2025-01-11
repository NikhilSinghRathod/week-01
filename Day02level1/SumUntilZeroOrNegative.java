
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total sum to 0.0
        double total = 0.0;

        // Infinite while loop to continuously take user input
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble(); // Read the user input

            // Check if the input is 0 or a negative number
            if (input <= 0) {
                // Break the loop if the input is 0 or negative
                break;
            }

            // Add the input to the total
            total += input;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner to free resources
        sc.close();
    }
}

