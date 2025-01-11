import java.util.Scanner;
public class AbundantNumber {
   public static void main (String [] args){
     
       // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the number
        System.out.println("Enter the Number :");
            int number = sc.nextInt();
    
        //create a variable sum 
        int sum= 0;

        //It is used for tracking whether the number is divisible or not
        for(int i =1 ; i<number ; i++){
          
          if(number%i==0){
             sum+=i;
           }
         }
       
        //Checking the sum is greater than number or not
        if(number<sum){
        System.out.println(" Number is Abundant Number ");
        }else{
        System.out.println(" Number is not a Abundant Number ");
        }

       }
}
