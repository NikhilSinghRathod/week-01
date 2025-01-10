import java.util.*;
public class ProfitandLoss{
  public static void main (String[] args){

   //create a variable Costprice to store value 
   int costPrice = 129;
   
   //create a variable Sellingprice to store value
   int sellingPrice = 191;

   //create a variable profit that track our pofit
   int profit = sellingPrice - costPrice;

  //create a variable percentage that store our 
  //profit in percentage
   double percentage = ((double)profit/costPrice)*100;

   //print the cost price , selling price , profit 
   //profit in percentage
   System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice +"\n"+
                     "The Profit is INR " +profit+ "and the Profit Percentage is "+percentage+"%");

  }
}