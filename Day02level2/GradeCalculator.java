import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics (out of 100): ");
        double physics = sc.nextDouble();
        
        System.out.print("Enter marks for Chemistry (out of 100): ");
        double chemistry = sc.nextDouble();
        
        System.out.print("Enter marks for Maths (out of 100): ");
        double maths = sc.nextDouble();

        // Ensure marks are valid
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Invalid marks entered! Please ensure marks are between 0 and 100.");
        } else {
            // Calculate total marks and percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = totalMarks / 3;

            
            if (percentage >= 80) {
               System.out.println("The average marks is "+ percentage + " , grade is A and level 4 , above agency -normalized standards");

            } else if (percentage >= 70) {
                System.out.println("The average marks is "+ percentage + " , grade is B and level 3 , at agency -normalized standards");

            } else if (percentage >= 60) {
                System.out.println("The average marks is "+ percentage + " , grade is C and level 2 , below, but approaching agency -normalized standards");

            } else if (percentage >= 50) {
                System.out.println("The average marks is "+ percentage + " , grade is D and level 1 , well below agency -normalized standards");

            } else if (percentage >= 40) {
                System.out.println("The average marks is "+ percentage + " , grade is E and level 1- , too below agency -normalized standards");

            } else {
                System.out.println("The average marks is "+ percentage + " , grade is F and Remedial Standards");

            }

                   }

        // Close the scanner to free resources
        sc.close();
    }
}
