import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3]; // [0]: Height, [1]: Weight, [2]: BMI
        String[] weightStatus = new String[numPersons];    // Array to store weight status

        // Input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Input weight and validate
            while (true) {
                System.out.print("Weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Weight must be positive. Please enter again.");
            }

            // Input height and validate
            while (true) {
                System.out.print("Height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("Height must be positive. Please enter again.");
            }

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Report:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println(+ personData[i][0]+ personData[i][1]+ personData[i][2]+ weightStatus[i]);
        }

        // Close the scanner
        sc.close();
    }
}
