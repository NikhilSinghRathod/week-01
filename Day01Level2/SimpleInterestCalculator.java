import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time in years
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.printf("The Simple Interest is "+ simpleInterest +" for Principal "+ principal +" Rate of Interest "+ rate + "and Time "+ time + " years ");

        // Close the scanner
        scanner.close();
    }
}
