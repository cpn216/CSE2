import java.util.Scanner;

public class GetIntegers    {
    public static void main(String[] args)  {
        
        //initialize scanner
        Scanner scan = new Scanner(System.in); //Scanner
        
        int integer = 0;
        int sum = 0;
        int i = 0;
        int counter = 1;
        
        
        System.out.print("Please enter 5 non-negative integers : ");
          
        //For loop repeats 6 times.
            
        for (i = 0; i < 5; i++) {
        
        //Looks for next Int. If not next in then does else statement scanning for next line.
            
        if (!scan.hasNextInt())  {
             System.out.println("Invalid input, enter again");
            i--;
            scan.nextLine();
            
        }
            
            else   {
                 
           
           
           integer = scan.nextInt();
        
        
            if (integer >= 0)    {
            sum += integer;
            }
            
            else if (integer < 0)   {
                System.out.println("Invalid input. Negative number, enter again.");
                i--;
                
            }
            
            }   
        
        
    
        
        
        }
        

    System.out.println("Sum is "+(sum)+"");
    



}
}