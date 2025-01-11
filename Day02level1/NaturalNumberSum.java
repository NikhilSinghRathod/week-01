import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the input as an integer

        // Check if the number is a natural number
        if (number >= 0) {
            // If the number is a natural number, calculate the sum
            int sum = number * (number + 1) / 2; // Formula for sum of n natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number, print an appropriate message
            System.out.println("The number is not a natural number. Please enter a non-negative integer.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

