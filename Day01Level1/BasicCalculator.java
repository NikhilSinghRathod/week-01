import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // used to enter the two numbers from user
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
   
       //Arithmetic operations to perform the calculation
       double Addition = number1+number2;
       double Subtraction = number1+number2;
       double Multiplication = number1*number2;
       double Division = number1/number2;

      // print the result of the operations
      System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+ number1+ " and "+ number2+ " is "             
                   +Addition+Subtraction+Multiplication+" and "+Division);

     sc.close();
  }
}