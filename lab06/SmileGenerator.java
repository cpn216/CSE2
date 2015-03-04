//This program produces smiles.
//
//lab-06
//SmileGenerator.java

//initial variables

import java.util.Random;


public class SmileGenerator {
public static void main(String[] args)  {
    
    int counter = 0;    //initial counter

while (counter<5)   {
    System.out.print(":)");
    counter++;
}

    System.out.println("");
    Random random = new Random();
    
    int min = 1;
    int max = 100;
    int counterRandom = 0;
    
    int randomNumber = random.nextInt(max-min+ 1) + min;
    
    while (counterRandom < randomNumber) {
        System.out.print(":)");
        counterRandom++;
        
        if (counterRandom % 30 == 0)  {
            System.out.println("");
        }
    
        
        
        
        
    }
    
     int randomVariable = 0;
        
        
        for (int i = 0; i < randomNumber; i++ ){
            System.out.print(":)");
            
            if (i == randomVariable){
                System.out.println();
                randomVariable++;
            }
            
        }
    
}
    
}
