
import java.util.Scanner;
import java.util.Random;
public class HW08   {
    
    
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
}
        
        
        
        //////
         public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //Made methods
    public static String getInput(Scanner scan, String string)  {
        
        while (!scan.hasNext("[Cc]")) {
            System.out.println("YEA RIGHT LOSER");
            System.exit(0); // exits program
           }
           System.out.println();
           scan.nextLine(); //clear buffer
           
        return string;
    }
    
    ///
    public static String getInput(Scanner scan, String string, int trial){
        Random random = new Random();
        int min = 0;
    int max = 1;
    trial = 0;
 
    int randomNumber = random.nextInt(max-min+ 1) + min;
        
        
        
        while (trial < 10){
       if (!scan.hasNext("[AaEe]"))    {
           System.out.println("Executed by GIANT! Game Over!");
           System.exit(0);  //exits program
       }
       
       else if (scan.hasNext("[Aa]")) {
           min = 0;
           max = 1;
           randomNumber = random.nextInt(max-min+ 1) + min;
           
           if (randomNumber ==1)    {
               System.out.println("Critical hit!");
               trial++;
               scan.nextLine(); //clear buffer
           }
           
           else {
               scan.nextLine();
           }
         
       }
       
       else if (scan.hasNext("[Ee]"))   {
           min = 0;
           max = 10;
           randomNumber = random.nextInt(max-min+ 1) + min;
           
           if (randomNumber==10)    {
               System.out.println("SUCCESSFUL ESCAPE");
               trial = 10;
               scan.nextLine();     //clear buffer
           }
           
           else {
               scan.nextLine();
           }
       }
       

       
       
 
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
      
    }
    return string;
    }
    
    public static String getInput(Scanner scan){
        
        int treasure;
        
        
        
        
        if (!scan.hasNextInt()) {
            treasure = 0;
        }
        
        else    {
        
        treasure = scan.nextInt();
        }
        
        
       switch (treasure)    {
        case 1 : System.out.println("You've recieved a large sum of money!");
        break;
        case 2 : System.out.println("You've recieved an even larger sum of money!");
        break;
        case 3 : System.out.println("You've got a dog!");
        break;
        default : System.out.println(" A Wrong Number! You get nothing! Better restart the game LOL");
        break;
    }
    String strings = "string";
    return strings; // dummy variable
        }
   
    
    

        
        
    
}