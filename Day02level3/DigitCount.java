import java.util.Scanner;
public class DigitCount {
   public static void main (String [] args){
     
       // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the salary and years of service
        System.out.println("Enter the Digit to find out the count of numbers :");
            int n = sc.nextInt();
    
        //create a variable count which count the number
        int count= 0;

        while(n!=0){
          n = n/10;
         count++;
       }
    
       // print the answer 
        System.out.println("The number has "+ count +" digits ");
}
}
