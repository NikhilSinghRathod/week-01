import java.util.Scanner;

public class TemperatureConversionad {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius using the formula (°F − 32) × 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Print the result
        System.out.print("The "+ fahrenheit +" fahrenheit is " + celsiusResult +"celsius");

        // Close the scanner
        sc.close();
    }
}
