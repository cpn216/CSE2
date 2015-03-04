
import java.util.Random;


public class MakeSymbols {
public static void main(String[] args)  {
    
    int counter = 0;    //initial counter

    Random random = new Random();
    
    int min = 0;
    int max = 100;
    int counterRandom = 0;
    
    int randomNumber = random.nextInt(max-min+ 1) + min;
    
    if (randomNumber%2 == 0) {
    
    System.out.println("Random number generated "+(randomNumber)+"");
    
    for (int i = 0; i < randomNumber; i++)   {
    System.out.print("*");

}

}

    else {
        
        System.out.println("Random number generated "+(randomNumber)+"");
        for (int i = 0; i < randomNumber; i++)  {
            System.out.print("&");
        }
    }
    
    
   
}}

