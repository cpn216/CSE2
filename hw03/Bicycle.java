//Cuong Nguyen
//
//hw03-Bicycle
//
//Bicycle.java
//
//Write a program where the user inputs number
//Program does Arithmetic

import java.util.Scanner;

public class Bicycle {
            //main method required for every Java program
            public static void main(String[] args)  {
                
                //intermediate variables
                
                double wheelDiameter=27.0,  //unit conversion
                PI=3.14159,                 //unit conversion
                feetPerMile=5280,           //unit conversion
                inchesPerFoot=12,           //unit conversion
                secondsPerMinute=60,        //unit conversion
                minutesPerHour=60;          //unit conversion
                double distanceTrip;
                double averageSpeed;
                double minutes;
                
                
                Scanner myScanner;
                myScanner = new Scanner( System.in);
                System.out.print(
                    "Enter the number of counters (an integer > 0) : ");
                    
                    //Accept user input
                    int countsTrip = myScanner.nextInt();
                    
                    //Gives distance in miles
                    distanceTrip=countsTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                    
                    
                    
                    System.out.print("Enter the number of seconds (an integer > 0) : ");
                    
                    //Accept user input
                    int Seconds = myScanner.nextInt();
                    
                    //computes mintues out of seconds
                    minutes=Seconds/secondsPerMinute;
        
                    
                    System.out.print("The distance was "+(int)(distanceTrip*100)/100.00+" miles and took "+(int)(minutes*100)/100.00+" minutes. ");
                    
                    System.out.print("");
                    
                    //Gives average speed (distance over time in mph)
                    averageSpeed=distanceTrip/minutes*minutesPerHour;
                    
                    System.out.print("The average mph was "+(int)(averageSpeed*100)/100.00+".");
                    
                    
                    
            }       //main method required for every program
}           //end of class