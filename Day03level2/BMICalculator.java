import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        // Input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.println("Weight (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.println("Height (in meters): ");
            heights[i] = sc.nextDouble();

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Report:");
                for (int i = 0; i < numPersons; i++) {
            System.out.println(" Height(m): "+heights[i]+ " Weight(kg): "+ weights[i]+ " BMI "+ bmis[i] + " Status "+ statuses[i]);
        }

        // Close the scanner
        sc.close();
    }
}
