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
}