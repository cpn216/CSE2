//
//
//
import java.util.Scanner;

public class zigzag {
    public static void main (String[] args) {
        //initial variable      
        int nStars = -1;
        boolean range = true;
        boolean playAgain = true;
        boolean checking = true;
        int check = 0;
        
        Scanner scan = new Scanner(System.in); //Scanner
        
        do  {
           // System.out.println("Enter an int between 3 and 33 : ");
           /* System.out.print("out of range");
            check = 0;
            */
            System.out.println("Enter an int between 3 and 33 : ");
           checking = scan.hasNextInt();
            
            while (!checking){
                scan.next();
                System.out.println("this is not right ");
                checking = scan.hasNextInt();
            }
            nStars = scan.nextInt();
            
            /*if (checking)   {
                check = 1;
            }
            else {
                check = 0;
                
            //System.out.println("blablabla");
            }    
            scan.next();
            }
            
            nStars = scan.nextInt();
            */
        
        }
         
        while (nStars > 33 || nStars < 3);
        
        
       /* 
        for (int i = 0; i < nStars; i++)   {
            System.out.println("*");
            for (int j = -1 ; i > j; j++){
        System.out.print(" ");
            }
        }
        */
    }
}