import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println(" FizzBuzz Output ");
            int i = 1; // Initialize the counter
            // Loop from 1 to the entered number using while loop
            while (i <= number) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // Print the number if not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
                // Increment the counter
                i++;
            }
        }

        // Close the scanner to free resources
        sc.close();
    }
}
