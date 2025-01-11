import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //  the user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        // the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Print the BMI value
        System.out.printf("Your BMI is: "+ bmi);

        // Determine the weight status based on BMI
        System.out.print("Weight Status: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        // Close the scanner
        sc.close();
    }
}
