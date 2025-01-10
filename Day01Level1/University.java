import java.util.*;
public class University{
  public static void main (String[] args){

   //create a variable fees that holds the 
   //amount in INR
   int fee = 125000;
   
   //create a variable discount percent 
   // how much discount have provided
   int discountPercent = 10;

   //create a variable discount 
   double discount = ((double)fee*discountPercent)/100;

  //create a variable discountedFee indicates
  //the new fee after discount
   double discountedFee = fee -discount;

   //print the fee and the discounted fee
   System.out.print(" The discount amount is INR "+ discount+" and final discounted fee is INR "+discountedFee);

  }
}