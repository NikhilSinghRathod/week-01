import java.util.Scanner;

public class PoundsToKilogramsConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor: 1 pound = 2.2 kilograms
        double weightInKilograms = weightInPounds * 2.2;

        // Print the results
        System.out.print("The weight of the person in pounds is "+ weightInPounds +" and in kilograms is "+ weightInKilograms);

        // Close the scanner
        scanner.close();
    }
}
