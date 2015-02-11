//Cuong Nguyen
//
//hw03-Root
//
//Root.java
//
//Write a program where the user inputs number
//Program does Arithmetic

import java.util.Scanner;

public class Root {
    //main method required for every java program
    public static void main(String[] args)  {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        System.out.print(
            "Enter the number you would like cubed : ");
            
            //Accept user input
            
            double x = myScanner.nextDouble();
            
            //Random guess that the root is x/3
            
            double guess=x/3;
            
            //First guess
            double guess1=(2*guess*guess*guess+x)/(3*guess*guess);
            
            //Second guess
            guess=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
            
            //third guess
            guess1=(2*guess*guess*guess+x)/(3*guess*guess);
            
            //fourth guess
            guess=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
            
            //fifth guess
            guess1=(2*guess*guess*guess+x)/(3*guess*guess);
        
        
        System.out.print("The cube root is "+(guess)+" ");
        
            
    }
}