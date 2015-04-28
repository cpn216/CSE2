import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class practice {
 
 public static void main(String[] arg) {
  int [] array = create();
  print(array);
  sort(array);
  
  
  
}

//create an array & fill with numbers randomly
public static int[] create(){
 int [] array = new int [50];
 Random rand = new Random();
 int input = rand.nextInt(5)+0;
 for(int i = 0; i < array.length; i++) {
  input = rand.nextInt(5)+0;
  array[i] = input;
 }
 return array;
}
//print out the arrays
public static void print(int[]array) {
 System.out.print("[ ");
 for(int i = 0; i < array.length; i++) {
  System.out.print(array[i]+" ");
 }
 System.out.println("]");
}
//create a linear search that finds the first instance of target number
public static void instance(int[]array,int target) {
 int index = -1;
 for(int i = 0; i < array.length; i++) {
  if(array[i] == target) {
   index = i;
   break;
  }
 }
 if (index == -1) {
  System.out.println("Target number was not found in the array");
 }
 
 else{
 System.out.println("The first instance "+target+" is found is at index : "+index);
 }
}
//create a linear search that counts the number of instances the target number appears
public static void number(int[]array, int target) {
 int appearance = 0;
 
 for (int i = 0; i < array.length; i++){
  if (array[i] == target) {
   appearance++;
  }
}

if (appearance == 0) {

}

else {
 System.out.println("The number appeared : "+appearance+" times.");
}

}
//counts the number of appearance of every number in the array
public static void outOfHand(int[]array, int target) {
 
 for (int i = 0; i<array.length;i++) {
  int appearance = 0;
  target = array[i];
  
  for (int j=0;j<array.length;j++) {
  if (array[j]==target) {
   appearance++;
  }
  }
  System.out.println(target+" appeared "+appearance+" times ");
 }
 

 
}
//binary search
public static void binary(int[]array, int target) {
 int low = 0;
 int high = array.length-1;
 int times = 0;
 
 while(high>=low) {
  times++;
  int middle = (high+low)/2;
 if(array[middle]<target) {
 low = middle+1;
 }
 else if(array[middle]==target) {
  break;
 }
 else{
  high = middle-1; 
 }
}

System.out.println(target+" was found after "+times+" iterations");

}
//sorting algorithm
public static void sort(int[]x) {
for (int i = 0; i < x.length - 1; i++) {
 int currentMin = x[i];
 int currentMinIndex = i;
 
 for(int j = i +1; j< x.length; j++) {
  if(currentMin > x[j]) {
   currentMin = x[j];
   currentMinIndex = j;
  }
 }
 
 if (currentMinIndex != i) {
  x[currentMinIndex] = x[i];
  x[i] = currentMin;
 }
 
}

 
}
//... testing
public static void {
 {
        int counter = 0;
        int [] valArray = new int[3];
        double [][][][] newArray = new double [3][][][];
        double [][][][] newArray2 = new double[3][][][];
    //This loop determines number of elements in each of the 3 arrays
 //*   
//  //Then puts the values of members into its own array;
//     for (int i = 0; i < array.length; i++)  {
//         int val = 0;
//         for (int j = 0; j < array[i].length; j++)   {
//             for (int k = 0; k < array[i][j].length; k++){
//                 for (int l = 0; l < array[i][j][k].length; l++){
//                   val++;
//                 }
//             }
//         }
//         valArray[i] = val;
//     }
    
    //Selection array sort..
    for (int i = 0; i < array.length - 1; i++)  {
         //Then puts the values of members in each 3D array
    
        int val = 0;
        
        
        for (int j = 0; j < array[i].length; j++)   {
            for (int k = 0; k < array[i][j].length; k++){
                for (int l = 0; l < array[i][j][k].length; l++){
                   val++;
                }
            }
        }
        
        int currentMin = val;
        int currentMinIndex = i;
        
        for (int m = i + 1; m < array.length; m++)  {
            //resets value = 0 to count elements of the 3D array
            val = 0;
            //Determines number of elements i+1 array
            for (int j = 0; j < array[m].length; j++)   {
            for (int k = 0; k < array[m][j].length; k++){
                for (int l = 0; l < array[m][j][k].length; l++){
                   val++;
                }
            }
        }
        
        if(currentMin > val)    {
            currentMin = val;
            currentMinIndex = m;
        }
            
        }
        
        //Creates new 3D array that is swapped
        if (counter == 0)    {
        if(currentMinIndex != i)    {
            
        newArray [i]  = new double [array[currentMinIndex].length][][];
        
        //Fills newarray with 3rd element size
        
            for(int j2 = 0; j2 < newArray[i].length; j2++){
                newArray[i][j2] = new double [array[i][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray[i].length; j2++) {
                for(int k2 = 0; k2 < newArray[i][j2].length; k2++)    {
                    newArray[i][j2][k2] = new double [array[i][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray[i].length; j++)    {
            for (int k = 0; k < newArray[i][j].length; k++) {
                for (int l = 0; l < newArray[i][j][k].length; l++)  {
                    newArray[i][j][k][l] = array[i][j][k][l];
                }
            }
        }
        
         
            
        }
    
        
        else {
            newArray[i] = new double [array[i].length][][];
            //Fills newarray with 3rd element size
        
            for(int j2 = 0; j2 < newArray[i].length; j2++){
                newArray[i][j2] = new double [array[i][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray[i].length; j2++) {
                for(int k2 = 0; k2 < newArray[i][j2].length; k2++)    {
                    newArray[i][j2][k2] = new double [array[i][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray[i].length; j++)    {
            for (int k = 0; k < newArray[i][j].length; k++) {
                for (int l = 0; l < newArray[i][j][k].length; l++)  {
                    newArray[i][j][k][l] = array[i][j][k][l];
                }
            }
        }
        
        }
        }
        else if(counter == 1)   {
        
        //Copies the array after 1 selection sort into a new array
        for(int j = 0; j < newArray2[0].length; j )
        
            
        if(currentMinIndex != i)    {
            
        newArray2 [i]  = new double [array[currentMinIndex].length][][];
        
        //Fills newarray with 3rd element size
        
            for(int j2 = 0; j2 < newArray2[i].length; j2++){
                newArray2[i][j2] = new double [array[i][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray2[i].length; j2++) {
                for(int k2 = 0; k2 < newArray2[i][j2].length; k2++)    {
                    newArray2[i][j2][k2] = new double [array[i][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray2[i].length; j++)    {
            for (int k = 0; k < newArray2[i][j].length; k++) {
                for (int l = 0; l < newArray2[i][j][k].length; l++)  {
                    newArray2[i][j][k][l] = array[i][j][k][l];
                }
            }
        }
        
         
            
        }
    
        
        else {
            newArray2[i] = new double [array[i].length][][];
            //Fills newarray with 3rd element size
        
            for(int j2 = 0; j2 < newArray2[i].length; j2++){
                newArray[i][j2] = new double [array[i][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray2[i].length; j2++) {
                for(int k2 = 0; k2 < newArray2[i][j2].length; k2++)    {
                    newArray2[i][j2][k2] = new double [array[i][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray2[i].length; j++)    {
            for (int k = 0; k < newArray2[i][j].length; k++) {
                for (int l = 0; l < newArray2[i][j][k].length; l++)  {
                    newArray2[i][j][k][l] = array[i][j][k][l];
                }
            }
        }
        
        }
        }
        counter++;
        }
        
      
       return newArray; 
    }
}
}