//Cuong Nguyen
//
//hw04
//
//WhichNumber.java
//
//Write a program that can figure out a user's input number

import java.util.Scanner;

public class WhichNumber {
        //main method required for every java program
        public static void main(String [] args) {
            
            //Character for y/Y or n/N
            char isEven;
            char isD3;
            char is6;
            char isD4;
            char is4;
            char isD6;
            char greater1;
            char is8;
            
            char isD5;
            char is10;
            char is2;
            char is3;
            char is9;
            
            char isGreater6;
            char isLess3;
            char is7;
            char is1;
            char is5;
            char lessThan3;
            
            
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            System.out.print(
                "Think of a number between 1 and 10 inclusive.");
                
            System.out.print(
                "Is your number even?");
                
             isEven = myScanner.next().charAt(0);
             
//Number is even. If statemenet within.
if (isEven == 'y'|| isEven == 'Y'){
             
    System.out.println("Is your number divisible by 3?");
        
    isD3 = myScanner.next().charAt(0);
            
//Number is even and divisible by 3. So = 6
        if (isD3 == 'y'|| isD3 == 'Y'){
             
            System.out.println("Is your number 6?");
            is6 = myScanner.next().charAt(0);
            
            //Asking if it is 6.
            if (is6 == 'y'|| is6 == 'Y'){
                System.out.println("Yay!");
            }
            
            else {
                System.out.println("That's inconsistent.. try again.");
            }
            }

//Number is even and not divisible by 3.
        else if (isD3 == 'n' || isD3 == 'N') {
            
            System.out.println("Is your number divisible by 4?");
            
            isD4 = myScanner.next().charAt(0);
            
//Number is even. not divisible 3. Divisible 4. So = 4 or 8.
                if (isD4 == 'y'|| isD4 == 'Y'){
                System.out.println("Is the number of times divided by 4 greater than 1?");
            greater1 = myScanner.next().charAt(0);
            
            if (greater1 == 'y' || greater1 == 'Y'){
                System.out.println("Is your number 8?");
                is8 = myScanner.next().charAt(0);
                
                if (is8 == 'y'|| is8 == 'Y'){
                    System.out.println("Yay!");
                    
                }
            
                
            
            else if (isD4 == 'n'|| isD4 == 'N'){
                System.out.println("Is your number 4?");
                is4 = myScanner.next().charAt(0);
                
                if (is4 == 'y'|| is4 == 'Y'){
                    System.out.println("Yay!");
                }
            }
            
            else {
                        System.out.println("That's inconsistent.. try again.");
                }
            
            }
            
            else {
                        System.out.println("That's inconsistent.. try again.");
                }
            
            }
            
//Number is even. Not divisible by 3. Not Divisible by 4. So 10 or 2.
    
                if (isD4 == 'n'|| isD4 == 'N'){
                
                System.out.println("Is your number divisible by 5?");
                
                isD5 = myScanner.next().charAt(0);
                
    //Number is even. Not divisible by 3. not divisible by 4. Divisible by 5. 
                if (isD5 == 'y'|| isD5 == 'Y'){
                    System.out.println("Is your number 10?");
                is10 = myScanner.next().charAt(0);
                
                if (is10 == 'y'|| is10 == 'Y'){
                    System.out.println("Yay!");
                }
                    
               else {
                System.out.println("That's inconsistent.. try again.");
            }
                    
                }
                
                if (isD5 == 'n'||isD5 =='N'){
                    System.out.println("Is your number 2?");
                is2 = myScanner.next().charAt(0);
                
                if (is2 == 'y'||is2 == 'Y'){
                    System.out.println("Yay!");
                }
                
                else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
                }
                
            }
                
}
        

}


//Number is odd. If statements within.

else if (isEven == 'n' || isEven == 'N') {
    
    System.out.println("Is your number divisible by 3?");
    
    isD3 = myScanner.next().charAt(0);
//Number is odd. and divisible by 3. So 9 or 3.
    if ( isD3 == 'y'|| isD3 == 'Y'){
        System.out.println("When divided by 3 is the result greater than 1?");
    greater1 = myScanner.next().charAt(0);
    
    if (greater1 == 'y'||greater1 == 'Y'){
        System.out.println("Is your number 9?");
    is9 = myScanner.next().charAt(0);
    if (is9 == 'y'||is9 == 'Y'){
        System.out.println("Yay!");
    }
    else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
    }
    
    else if (greater1 == 'n'||greater1=='N'){
        System.out.println("Is your number 3?");
        is3 = myScanner.next().charAt(0);
        if(is3 == 'y'||is3 == 'Y'){
            System.out.println("Yay!");
        }
        else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
    }
    }
//Number is odd. Not divisible by 3.    
    else if (isD3 == 'n'|| isD3 =='N'){
        System.out.println("Is it greater than 6?");
    isGreater6 = myScanner.next().charAt(0);
    
//Is your number 7?    
        if (isGreater6 == 'y'||isGreater6 == 'Y'){
            System.out.println("Is your number 7?");
            is7 = myScanner.next().charAt(0);
        if (is7 == 'y'||is7=='Y'){
            System.out.println("Yay!");
            
        }
        else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
            
        }
        
//Number is odd. not divisible by 3. Less than 6. 1 or 5.       
        
        //
        else if (isGreater6 == 'n'||isGreater6=='N'){
            
            System.out.println("Is it less than 3?");
            
            lessThan3 = myScanner.next().charAt(0);
            
            //Number less than 3. is 1.
            if (lessThan3 == 'y'||lessThan3 == 'Y'){
                System.out.println("Is your number 1?");
                is1 = myScanner.next().charAt(0);
                if (is1 =='y'||is1=='Y'){
                    System.out.println("Yay!");
                    
                }
                else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
            }
            
            //Number greater than 3. is 5.
            else if (lessThan3 == 'n'||lessThan3 =='N'){
                
                System.out.println("Is your number 5?");
                is5 = myScanner.next().charAt(0);
                if (is5 =='y'||is5=='Y'){
                    System.out.println("Yay!");
                    
                }
                else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
                
            }
            
            
            
            
            
        }
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    else {
                    System.out.println("That's inconsistent.. try again.");
                    
                }
        
        
            
}

//
else {
            System.out.print("Please use only y,Y for yes or n,N for no.");
}


}
}
