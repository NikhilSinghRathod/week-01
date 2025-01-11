import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        //user for input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert the number to a string to handle each digit easily
        String numberStr = Long.toString(Math.abs(number));

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Iterate over each character in the string
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        // Close the scanner
        sc.close();
    }
}
