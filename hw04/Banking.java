//Cuong Nguyen
//
//hw04
//
//Banking.java
//
//Write a program that banks..

import java.util.Scanner;
import java.util.Random;


public class Banking {
    //main method required for every java program

    
public static void main(String [] args) {
    
    Scanner myScanner; //Scanner
    myScanner = new Scanner(System.in); //Scanner
    
    //initial variables
    int action = 1;
    int deposit = 0;
    int withdraw = 0;
    
    
    // Generates a random 4 digit integer
    int min = 1000;
    int max = 5000;

    
    Random number = new Random();
    
        int cash = number.nextInt(max - min + 1 ) + min;
    //
    
    System.out.println("Welcome to the bank.");
    System.out.println("");
    System.out.println("You currently have $"+(cash)+" in your bank account at the moment.");
    System.out.println("What would you like to do? Press '0' to see balance, '1' for deposit, '2' for withdraw.");
    
        action = myScanner.nextInt();
    
    switch (action) {
        case 0: System.out.println("You currently have $"+(cash)+" in your bank account at the moment.");
            break;
       
        case 1: System.out.println("How much would you like to deposit?");
        
        deposit = myScanner.nextInt();
        
        int totalCash = cash + deposit;
        
        
         
         if (deposit >= 0)   {
         System.out.println("You've deposited $"+(deposit)+" your new total is $"+(totalCash)+".");
         System.out.println("");
         System.out.println("Thank you. Come again.");
         }
         
         else {
             System.out.println("I'm sorry, that's not a valid positive integer. Please start the program again.");
         }
         
            break;
         
         case 2: System.out.println("How much would you like to withdraw?");
         
         withdraw = myScanner.nextInt();
         
         totalCash = cash - withdraw;
         
        if (withdraw <= cash){
         System.out.println("You've withdrawn $"+(withdraw)+". Your new total is $"+(totalCash)+".");
         System.out.println("");
         System.out.println("Thank you. Come again.");
        }
        
        else if (withdraw > cash){
            System.out.println("You're withdrawing more money than you have available. Please enter a valid amount.");
        }
        
        else {
            System.out.println("I'm sorry, that's not a valid positive integer. Please start the program again.");
        }
        
        break;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

}
}
