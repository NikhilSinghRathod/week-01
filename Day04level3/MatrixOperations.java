import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter columns for matrix B: ");
        int colsB = scanner.nextInt();

        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("Addition of Matrix A and B:");
            displayMatrix(addMatrices(matrixA, matrixB));

            System.out.println("Subtraction of Matrix A and B:");
            displayMatrix(subtractMatrices(matrixA, matrixB));
        } else {
            System.out.println("Addition and subtraction not possible due to dimension mismatch.");
        }

        if (colsA == rowsB) {
            System.out.println("Multiplication of Matrix A and B:");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch.");
        }

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        if (rowsA == 2 && colsA == 2) {
            System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse2x2(matrixA));
        } else if (rowsA == 3 && colsA == 3) {
            System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse3x3(matrixA));
        } else {
            System.out.println("Determinant and inverse calculation only supported for 2x2 or 3x3 matrices.");
        }

        scanner.close();
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int minorRow = 0;
                for (int k = 0; k < 3; k++) {
                    if (k == i) continue;
                    int minorCol = 0;
                    for (int l = 0; l < 3; l++) {
                        if (l == j) continue;
                        minor[minorRow][minorCol++] = matrix[k][l];
                    }
                    minorRow++;
                }
                inverse[j][i] = (determinant2x2(minor) / (double) determinant) * ((i + j) % 2 == 0 ? 1 : -1);
            }
        }
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
