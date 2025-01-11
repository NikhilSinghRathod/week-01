import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array (Matrix) with user-defined dimensions
        int[][] matrix = new int[rows][cols];

        // Take user input to populate the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to copy elements from the 2D array
        int[] oneDArray = new int[rows * cols];
        int index = 0; // Index for the 1D array

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        // Display the 2D array
        System.out.println("\nThe 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the 1D array
        System.out.println("\nThe 1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
