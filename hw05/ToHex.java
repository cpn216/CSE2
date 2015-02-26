//Cuong Nguyen
//
//hw05-ToHex
//

import java.util.Scanner;
public class ToHex {
        //main method required for every program
        public static void main (String[] args) {
            
        //Setting up Scanner    
        
        Scanner scan = new Scanner (System.in);
        
        
        //Ask user to input 3 integers
        System.out.println("Please enter three numbers representing RGB values to be represented as hexadecimal values : ");
        
        //declare the integers as well as make their values the scanner input
       int valueRGB = -1;
       int counter = 0;
       int hex = 0;
       int hexRem = 0;
       String hexString = "0";
       String hexRemString = "0";
       
        
        //while loop has next int, value RGB is next int
        while (scan.hasNextInt()) {
            
            if (scan.hasNextInt()) {
                
            valueRGB = scan.nextInt();
            counter++;
            hex = valueRGB/16;
            hexRem = valueRGB%16;
            } 
            
            //if statement. input out of range
             if (valueRGB < 0 || valueRGB >= 256 )  {
                System.out.println("Sorry, you need to enter a positive integer within 0-255 not "+(valueRGB)+".");
                break;
            }
            
            //prints out hexadecimal for hex < 10 (i.e. 4A)
            else if (valueRGB < 256 && valueRGB > 16 && hex < 10)   {
                switch(hexRem) {
                case 10 : System.out.print((hex)+"A");
                break;
                case 11 : System.out.print((hex)+"B");
                break;
                case 12 : System.out.print((hex)+"C");
                break;
                case 13 : System.out.print((hex)+"D");
                break;
                case 14 : System.out.print((hex)+"E");
                break;
                case 15 : System.out.print((hex)+"F");
                break;
                default : System.out.print(+(hex)+(hexRem)+"");
                break;
                }
            }
            
            //prints out hex+hexRem for hexRem less than 10 (i.e. A4)
            else if (valueRGB < 256 && valueRGB > 16 && hexRem < 10)  {
            switch(hex) {
                case 10 : 
                    System.out.print("A"+(hexRem)+"");
                break;
                case 11 : 
                    System.out.print("B"+(hexRem)+"");
                break;
                case 12 : 
                    System.out.print("C"+(hexRem)+"");
                break;
                case 13 : 
                    System.out.print("D"+(hexRem)+"");
                break;
                case 14 : 
                    System.out.print("E"+(hexRem)+"");
                break;
                case 15 : 
                    System.out.print("F"+(hexRem)+"");
                break;
                default : 
                    System.out.print(""+(hex)+""+(hexRem)+"");
                break;
            }
            
            }
            
            
            
            //prints out if hex >= 10 and hexRem >= 10
            else if (valueRGB < 256 && valueRGB > 16 && hex >= 10 && hexRem >= 10) {
            
              switch(hex) {
                case 10 : hexString = "A";
                break;
                case 11 : hexString = "B";
                break;
                case 12 : hexString = "C";
                break;
                case 13 : hexString = "D";
                break;
                case 14 : hexString = "E";
                break;
                case 15 : hexString = "F";
                break;
                default :
                break;
            }
            
            switch(hexRem)  {
                case 10 : hexRemString = "A";
                break;
                case 11 : hexRemString = "B";
                break;
                case 12 : hexRemString = "C";
                break;
                case 13 : hexRemString = "D";
                break;
                case 14 : hexRemString = "E";
                break;
                case 15 : hexRemString = "F";
                break;
                default :
                break;
            }
            
            System.out.print(""+(hexString)+""+(hexRemString)+"");
            
            }// end of if statement
            

            
          
            
            
            //prints out 0'number' for valueRGB less than or equal to 16.
            else if (valueRGB <= 16 && valueRGB >= 0)   {
                switch(valueRGB)    {
                case 10 : System.out.print("0A");
                break;
                case 11 : System.out.print("0B");
                break;
                case 12 : System.out.print("0C");
                break;
                case 13 : System.out.print("0D");
                break;
                case 14 : System.out.print("0E");
                break;
                case 15 : System.out.print("0F");
                break;
                default : System.out.print("0"+(valueRGB)+"");
                break;
                }
            }
            
        }
            
            if (counter != 3)    {
                System.out.println("Sorry, your input must consist of integers");
            
            }

        }
        
        }
        
        
        
