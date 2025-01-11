
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter a number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt(); // Read the user input

        // Check if the number is a valid natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return; // Exit if the input is not a valid natural number
        }

        // Use a for loop to iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                // The number is odd
                System.out.println(i + " is an odd number.");
            }
        }

        // Close the scanner to free resources
        sc.close();
    }
}

