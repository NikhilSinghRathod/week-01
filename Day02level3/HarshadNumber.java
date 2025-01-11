import java.util.Scanner;
public class HarshadNumber {
   public static void main (String [] args){
     
       // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the Number
        System.out.println("Enter the Number :");
            int number = sc.nextInt();

       //for having cpoy value inside this
        int n = number;
    
        //create a variable count which count the number
        int sum= 0;

        while(number!=0){
          int digits = number%10;
          sum+=digits;
          number = number/10;
       }
        
        //checking whether the number is divisible by its own sum of digits
        if(n%sum==0){
        System.out.println(" Number is Harshad Number ");
        }else{
        System.out.println(" Number is not a Harshad Number ");
        }

       }
}
