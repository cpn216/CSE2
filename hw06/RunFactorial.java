//hw 06
// Run factorial between 9 and 16

import java.util.Scanner;

public class RunFactorial   {
    public static void main(String[] args)  {
        
        // main variables
        int integer = 0;
        int i = 1;
        long factorial = 1;
        int j = 0;
        
    System.out.println("Please enter an integer between 9 and 16 inclusively");
    
    Scanner scan = new Scanner(System.in); //Scanner
    
        while (j < 1) {     //infinite loop
        
        
        if (!scan.hasNextInt()){

            
            System.out.println("Invalid input. Please enter an integer between 9 and 6 (inclusive)");
            scan.nextLine();
        }
        
        else {
           
            
            integer = scan.nextInt();
            
        if (integer >= 9 && integer <= 16)  {
            
            while (i <= integer)    {
                factorial = factorial * i;
                i++;
                
            }
            
            System.out.println("!"+(integer)+"="+(factorial)+"");
            j = 2;      //breaks out infinte loop
        
        }
        
        else    {
           System.out.println("Please enter an integer between 9 and 6 (inclusive)");
          
        }
        
        }
        
        

    
    
        }
    
    }
    }
