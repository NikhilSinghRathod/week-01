import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number; // Convert to positive for digit extraction
        }

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10; // Get the last digit
            number /= 10;           // Remove the last digit
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        if (isNegative) {
            System.out.print("-");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner
        sc.close();
    }
}
