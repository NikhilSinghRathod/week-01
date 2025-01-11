import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Make a variable to store the prime status
        Boolean isPrime = true;

        // Using a for loop to check if the number is divisible by any other number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false; // If divisible, the number is not prime
                break; // Exit the loop once we find a divisor
            }
        }

        // Print the result outside the loop
        if (isPrime && number > 1) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }

        // Close the scanner
        sc.close();
    }
}
