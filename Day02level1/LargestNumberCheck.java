import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {

        System.out.println("User can only enter the Natural Number other wise it would show error");
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt(); // Read the first number

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt(); // Read the second number

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt(); // Read the third number

        // Check if the first number is the largest
        if (number1 > number2 && number1 > number3) {
            System.out.println(" The first number is the largest among 3 ");
        } else if (number2 > number3){
            System.out.println("The Second number is the largest among 3");
        }else{
            System.out.println("The Third number is the largest among 3");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

