//Cuong Nguyen
//
//hw03-FourDigits
//
//FourDigits.java
//
//Write a program that prompts user to input number as a double
//Program prints out the first four digits to the right of the decimal

import java.util.Scanner;

public class FourDigits {
    //main method required for every java program
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        System.out.print(
            "Enter a double and I display the four digits to the right of the decimal point : ");
            
            //Accept user input
            
            double number = myScanner.nextDouble();
            
            int truncatedNumber = (int) (number*1000)/1000;
            
            //Using truncated number to get only the decimal places
            double onlyDecimal=number-truncatedNumber;
            
            //Use this to get the four places after the decimal
            onlyDecimal=(onlyDecimal*100)/100.0000;
            
            //To obtain the four digits
            int fourDigits=(int)(onlyDecimal*10000);
            
            System.out.print("The four digits are "+(fourDigits)+"");
    }
}