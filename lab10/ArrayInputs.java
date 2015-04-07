//
//

import java.util.Scanner;

public class ArrayInputs    {
public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the size of a one-dimensional array.");
    int input = scan.nextInt();
    int [] theArray = new int [input];
    
    
    
    for (int i = 0; i < input; i++) {
    System.out.println("Fill up the array with integers.");
    int notInput = scan.nextInt();
    theArray[i] = notInput;
    }
    
    System.out.println("The array is :");
    
    for (int i = 0; i < input; i++){
    System.out.println(theArray[i]);
    }
    
    
    
}
}