import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define maximum digits allowed and array to store the digits
        final int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits from the number and store in the array
        while (number != 0) {
            // Add last digit to the array
            digits[index] = number % 10;
            index++;

            // Break if array reaches its max size
            if (index == maxDigits) {
                System.out.println("Maximum digit storage reached. Remaining digits ignored.");
                break;
            }

            // Remove the last digit from the number
            number /= 10;
        }

        // Initialize variables for largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second-largest before changing largest
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Digits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
        } else {
            System.out.println("No digits found.");
        }

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (only one unique digit).");
        }

        // Close the scanner
        sc.close();
    }
}
