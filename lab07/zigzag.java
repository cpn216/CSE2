//
//
//
import java.util.Scanner;

public class zigzag {
    public static void main (String[] args) {
        //initial variable      
        int nStars = 10;
        Scanner scan = new Scanner(System.in);
        int nStarts = 0;
        
      
       
        
        while   (nStarts > 33 || nStarts < 3)   {
        System.out.println("Enter an integer between 3 and 33");
        while (!scan.hasNextInt())  {
        System.out.println("Enter an integer between 3 and 33");
        scan.next();
        }
        
        nStarts = scan.nextInt();
        
        }
        
        
        
        
        
        for (int i = 1; i< nStarts; i++) {
            System.out.print("*");
            }
            
            for (int i = 0; i < nStarts; i++)    {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            for (int i = 0; i< nStarts; i++) {
            System.out.print("*");
            }
            
            
        
        
        
      
        
    }
}