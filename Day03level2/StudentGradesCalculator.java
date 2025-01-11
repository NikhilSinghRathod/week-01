import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3]; // [0]: Physics, [1]: Chemistry, [2]: Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] >= 0 && marks[i][j] <= 100) break;
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] =" Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = " Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = " Level 2,below ,but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = " Level 1, well below agency-normalized standards";
            } else if(percentages[i] >=40) {
                grades[i] = " Level 1-, too below agency-normalized standards";
            }else{
               grades[i] = " Remedial standards";
            }
        }

        // Display the results
        System.out.println("\nStudent Report:");
               for (int i = 0; i < numStudents; i++) {
            System.out.println(" Student "+ (i + 1) +" Physics " + marks[i][0] +" Chemistry " +marks[i][1]+" Maths "+ marks[i][2]+" Percentage "+ percentages[i]+" Grade "+ grades[i]);
        }

        // Close the scanner
        sc.close();
    }
}
