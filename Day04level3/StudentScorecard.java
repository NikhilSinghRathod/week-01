import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for Physics, Chemistry, and Math
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        scanner.close();
    }

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // Columns: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Random score between 60 and 100 for Physics
            scores[i][1] = random.nextInt(41) + 60; // Random score between 60 and 100 for Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Random score between 60 and 100 for Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Columns: Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}
