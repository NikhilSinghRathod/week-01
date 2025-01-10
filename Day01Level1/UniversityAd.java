import java.util.*;
public class UniversityAd{
  public static void main (String[] args){
    
   Scanner sc = new Scanner(System.in);
     System.out.print("Enter the fees ");

   //create a variable fees that holds the 
   //amount in INR
   double fee = sc.nextDouble();
   
   //create a variable discount percent 
   // how much discount have provided
   System.out.print("Enter the discount you Want");
   double discountpercent = sc.nextDouble();

   //create a variable discount 
   double discount = (fee*discountpercent)/100;

  //create a variable discountedfee indicates
  //the new fee after discount
   double discountedfee = fee -discount;

   //print the fee and the discounted fee
   System.out.print(" The discount amount is INR "+ discount+" and final discounted fee is INR "+discountedfee);

  }
}