import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
    
  public static void main(String [] arg){
      
	Scanner scan=new Scanner(System.in);
	
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;

	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //method randomInput
  
    public static int [] randomInput   () {
        int [] randomList = new int [10];
        for (int i = 0; i < 10; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt((9-0)+1)+0;
    randomList[i]=randomNum;
        }
        return randomList;
        }
        
        
        
    
    
    //method delete ????
    
    public static int [] delete (int[] list, int pos)    {
        int length = 9;
if (pos > -1 && pos < 10)   {
    length = 9;
    int[] newArray1 = new int [length];
    
    for (int i = 0; i < length; i++)   { 
        
        if (i!=pos){
        newArray1[i]=list[i];
        }
        
        else {
            for (int j = i; j < length; j++)   {
                newArray1[j]=list[j+1];
            }
            break;
        }
    }

         return newArray1;
}
        

    

else {
    length = 10;
    int[] newArray1 = new int [length];
    System.out.println("Index is not valid.");
    
    for (int i = 0; i < 10; i++)    {
        newArray1[i]=list[i];
    }
    
    return newArray1;
}
    


    }
    
    //
    

    public static int[] remove (int [] list, int target)  {
        int length = 10;
        
        if (target > -1 && target < 10) {
            System.out.println("Element"+(target)+"found");
           
            for (int i = 0; i < 10; i++)    {
                if (list[i]==target){
                    length--;
                }
                
            }
            
            int []newArray2 = new int [length];
            for (int i = 0; i < length; i++)    {
                
                if (list[i]==target)    {
                    for (int j = i; j <= length; j++)    {
                        list[j]=list[j+1];
                    }
                }
        
            }
            
            for (int i = 0; i < length; i++){
                newArray2[i]=list[i];
            }
            
        
            
            return newArray2;
            
            
        }
        
        else {
            System.out.println("Element"+(target)+"not found");
            int []newArray2 = new int [length];
            for (int i = 0; i < 10; i++)    {
        newArray2[i]=list[i];
    }
    return newArray2;
        }
        
    
        
    }
    
    
    
            
            
        }
        
        
        
        
    
  
  
  
