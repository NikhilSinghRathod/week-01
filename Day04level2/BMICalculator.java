import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        final int NUM_PERSONS = 10;
        double[][] data = new double[NUM_PERSONS][3]; // 2D array to store weight, height, and BMI
        String[] bmiStatus;

        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        for (int i = 0; i < NUM_PERSONS; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        bmiStatus = determineBMIStatus(data);

        // Display results
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < NUM_PERSONS; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI for all persons and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI calculation
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
}
