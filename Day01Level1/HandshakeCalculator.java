import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.print("The maximum number of handshakes among students is "+ handshakes);

        // Close the scanner
        sc.close();
    }
}