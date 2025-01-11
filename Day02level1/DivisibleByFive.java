import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //The user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the integer input

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            // If the remainder is 0, the number is divisible by 5
            System.out.println(" The number " + number + " is divisible by 5");
        } else {
            // Otherwise, the number is not divisible by 5
            System.out.println(" The number " + number + " is not divisible by 5 ");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

