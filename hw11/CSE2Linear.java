//
//
import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int input;
    int [] theArray = new int [15];
   
    
    System.out.println("Enter 15 ints for final grades in CSE2:");
    
    
    for (int i = 0; i < 15; i++)    {
        
    if (!scan.hasNextInt()) {
        System.out.println("Error. Not an int. Program end");
        System.exit(0);
    }
    
    else {
    
    input = scan.nextInt();
    
    if (input<0||input>100) {
        System.out.println("Int is out of range from 0-100");
    }
    
    else    {
    theArray[i] = input;
    }
    }
    }
    
    for (int i = 0; i < 14; i++)    {
        if (theArray[i]>theArray[i+1]){
            System.out.println("The grades entered is not all in ascending order");
            System.exit(0);
        }
    }
    
    
    System.out.print("The grades, sorted, are :");
    
    for (int i = 0; i < 15; i++){
        System.out.print(" "+theArray[i]);
    }
    
    System.out.println("");
    
    binarySearch(theArray);
    shuffleArray(theArray);
    
    System.out.print("Scrambled :");
    for (int i = 0; i < 15; i++){
        System.out.print(" "+theArray[i]);
    }
    
    System.out.println("");
    
    linearSearch(theArray);
    
   
    
    }
    
    //new method that does binary search
  public static int binarySearch (int[] theArray)    {
        System.out.println("Enter a grade you would like to be searched");
        Scanner scan = new Scanner(System.in);
    int search = scan.nextInt();
    int low = 0;
    int high = 14;
    int middle = (low+high)/2;
    int newVariable = -1;
    int iteration = 0;
        
    for (int i = 0; i < 4; i++)    {
        if (theArray[middle]>search) {
            high = middle;
            middle = (low+high)/2;
            iteration++;
        }
        
        else if (theArray[middle]<search)    {
            low = middle;
            middle = (low+high)/2;
            iteration++;
        }
        
        else if (theArray[middle]==search)  {
            newVariable=middle;
            break;
        }
    }
    
    ///
    if (newVariable == -1)    {
                System.out.println(search+" was not found in the list with "+iteration+" iterations");
            }
            else {
                System.out.println(search+" was found in list with "+iteration+" iterations");
            }
            return -1;  //dummy value
  }  
    
    //new method for scrambling the array
    public static void shuffleArray(int[] theArray)    {
         Random rand = new Random();
        int numRandom = rand.nextInt((14-0)+1)+0;
        int placeHolder = 0;
        
        for (int j = 0; j<10; j++)     {
        for (int i = 14; i > 0; i--) {
            numRandom = rand.nextInt((14-0)+1)+0;
            placeHolder = theArray[i];
            theArray[i] = theArray[numRandom];
            theArray[numRandom] = placeHolder;
        }
        }
        
    }
    
    //new method for linear search
    public static void linearSearch(int[] theArray) {
        
        System.out.print("Enter a grade you would like to be searched : ");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        
        int search = scan.nextInt();
        
        int min = theArray[0];
        int max = theArray[0];
        int holder = -1;
        
        for (int i = 0; i < 15; i++)    {
                if (theArray[i]==search)  {
                    holder = i;
                break;
                }
            }
            if (holder == -1)    {
            System.out.print("The grade was not found");
            }
            else    {
            System.out.print(search+"was found in the list with "+(holder+1)+" iterations");
            }
            
    }
    
}