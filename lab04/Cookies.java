//Cuong Nguyen
//
//lab04-Cookies
//
//Cookies.java
//
//Write a program for cookies

import java.util.Scanner;

public class Cookies {
    //main method required for every java program
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        System.out.print(
            "Enter the number of People : " );
        int numberPeople=1;
        if(myScanner.hasNextInt()){
    
        numberPeople = myScanner.nextInt();
        
        if(numberPeople<0) {
            System.out.println("You did not enter an int > 0 ");
        }
        }
    
        else {
            System.out.println("You did not enter an int");
            return;     //leaves the program, i.e.
                            //the program terminates
                            
                            
        }
        
        
        System.out.print("Enter the number of cookies you are planning to buy : ");
        int numberCookies=1;
        
        //if statement to see if integer
        if(myScanner.hasNextInt()){
        //Accept user input
       numberCookies = myScanner.nextInt();
        
        if(numberCookies<0) {
                System.out.println("You did not enter an int > 0 ");
        }
        }
        
        else{
            System.out.println("You did not enter an int");
            return;
        }
        
        
        
        System.out.print("How many do you want each person to get? ");
        int numberOther =1;
        
        if(myScanner.hasNextInt()){
            
        //Accept user input
        numberOther = myScanner.nextInt();
        
        if(numberOther<0)   {
            System.out.println("You did not enter an int > 0 ");
        }
        
        }
        
        else{
            System.out.println("You did not enter an int");
            return;
        }
        
        //Determining if we have enough cookies
        if((numberOther*numberPeople)<numberCookies)  {
            
            
            if(numberCookies%numberPeople==0){
                System.out.println("You have enough cookies and they will divide evenly");
            }
            else{
                System.out.println("You have enough cookies and they will not divide evenly");
            }
        }
        
            else{
                System.out.println("You do not have enough cookies and need "+((numberPeople*numberOther)-numberCookies)+" cookies");
            }
            }
            
        }
        
        
        
