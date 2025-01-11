import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter a number
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = sc.nextInt(); // Read the input number

        // Initialize variables
        int originalNumber = number; // Store the original number
        int sum = 0;                 // Initialize sum to zero

        // Use a while loop to calculate the sum of cubes of the digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit using modulus
            sum += Math.pow(digit, 3);       // Add the cube of the digit to the sum
            originalNumber /= 10;           // Remove the last digit from the number
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}
