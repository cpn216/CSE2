//
//

import java.util.Scanner;

public class waves {
    public static void main(String[] args)  {
        System.out.println("Enter an integer from 1 to 30");
        Scanner scan = new Scanner(System.in); //Scanner
        int a,b,c,d,cnt,f;
        d = scan.nextInt();
           if(d%2==0)
        {
            for(a=d;a>=0;a--)
            {
                for(c=a;c<d;c++)
                {
                    System.out.print(d);
                }
                    System.out.println("");
            }
        }
        else
        {
            for(a=0;a<=d;a+=1)
            {
                for(c=a;c<d;c++)
                {
                    System.out.print(d);
                }
                    System.out.println("");
            }
        }
 
        }
}