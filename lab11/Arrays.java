//
//

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args)  {
        
        int array1[] = new int [50];
        int array2[] = new int [50];
       
        Random rand = new Random();
        int randomNum;
        int randomNum1;
        int variable = 0;
        
            for (int i = 0; i < 50; i++)    {
                randomNum = rand.nextInt((50-0)+1)+0;
                array1[i] = randomNum;
            }
            
            for (int i = 0; i < 50; i++)    {
                randomNum1 = rand.nextInt((50-0)+1)+0;
                variable += randomNum1;
                array2[i] = variable;
                System.out.println(array2[i]);
            }
            
            int min = array1[0];
            int max = array1[0];
            
            for (int i = 0; i < 50; i++)    {
                if (array1[i]>max)  {
                    max = array1[i];
                }
                if (array1[i]<min)  {
                    min = array1[i];
                }
            }
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an input");
            int input = scan.nextInt();

            
            int low = 0;
            int high = 49;
            int middle = (low+high)/2;
            int newVariable = -1;
            
            for (int i = 0; i < 50; i++)    {
            
            if (array2[middle]>input)   {
            high = middle;
            middle = (low+high)/2;
            }
            
            else if (array2[middle] < input) {
                low = middle;
            middle = (low+high)/2;
            }
            
            else if (array2[middle]==input){
                newVariable = middle;
                break;
            }
            else if (input < 0)  {
                System.out.println("Out of range");
                System.exit(0);
            }
            
            }
            
            if (newVariable == -1)    {
                System.out.println(input+" was not found");
                
            }
            
            else {
                System.out.println("Found at "+(newVariable)+"");
            }
            
             System.out.println(max);
             System.out.println(min);
            
    }
    
}