import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input for the base (number) and the exponent (power)
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Variable to store the result, initialized to 1 (because any number raised to power 0 is 1)
        int result = 1;

        // Loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number in each iteration
        }

        // Output the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        sc.close();
    }
}
