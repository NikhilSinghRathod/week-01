
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the number input

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than 0, it is positive
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the number is less than 0, it is negative
            System.out.println("The number is negative.");
        } else {
            // If the number is 0, print zero
            System.out.println("The number is zero.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

