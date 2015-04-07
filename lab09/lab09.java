//
import java.util.Random;
import java.util.Scanner;


public class lab09  {
public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String ok = "Y";
    
do  {
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10);
    
    String adj = adjective(randomInt);
    String subject = subject(randomInt);
    String verb = pastTenseV(randomInt);
    String object = object(randomInt);
    
    System.out.println("The "+(adj)+ " "+(subject)+" "+(verb)+" "+(object)+".");
    
    System.out.println("Would you like to run again? Y or N");
    
    ok = scan.next();
    
    
    
    
}

while (!ok.equals("N"));
    
    
    
    
}


public static String adjective  (int x) {
    String adj = ("");
    switch(x)   {
    case 0 : adj = "annoyed";
    break;
    case 1 : adj = "fast";
    break;
    case 2 : adj = "slow";
    break;
    case 3 : adj = "fasidious";
    break;
    case 4 : adj = "humble";
    break;
    case 5 : adj = "happy";
    break;
    case 6 : adj = "sad";
    break;
    case 7 : adj = "energetic";
    break;
    case 8 : adj = "bored";
    break;
    case 9 : adj = "tired";
    break;
    default : break;
        
    }
    
    return adj;
    
}

public static String subject    (int x) {
    String subject = ("");
    switch(x)   {
    case 0 : subject = "Kevin";
    break;
    case 1 : subject = "dog";
    break;
    case 2 : subject = "cat";
    break;
    case 3 : subject = "eraser";
    break;
    case 4 : subject = "keyboard";
    break;
    case 5 : subject = "pencil";
    break;
    case 6 : subject = "Jackson5";
    break;
    case 7 : subject = "Robert DeNiro";
    break;
    case 8 : subject = "spaceship";
    break;
    case 9 : subject = "computer";
    break;
    default : break;
        
    }
    
    return subject;
    
}

public static String pastTenseV  (int x) {
    String verb = ("");
    switch(x)   {
    case 0 : verb = "jumped";
    break;
    case 1 : verb = "walked";
    break;
    case 2 : verb = "sang";
    break;
    case 3 : verb = "ran";
    break;
    case 4 : verb = "smashed";
    break;
    case 5 : verb = "hopped";
    break;
    case 6 : verb = "kicked";
    break;
    case 7 : verb = "breathed on";
    break;
    case 8 : verb = "demolished";
    break;
    case 9 : verb = "erased";
    break;
    default : break;
        
    }
    
    return verb;
    
}

public static String object (int x)   {
    
    String object = ("");
    switch(x)   {
    case 0 : object = "table";
    break;
    case 1 : object = "paper";
    break;
    case 2 : object = "leg";
    break;
    case 3 : object = "mouse";
    break;
    case 4 : object = "Kevin";
    break;
    case 5 : object = "David";
    break;
    case 6 : object = "wall";
    break;
    case 7 : object = "ball";
    break;
    case 8 : object = "tv";
    break;
    case 9 : object = "garage";
    break;
    default : break;
        
    }
    
    return object;
}

}