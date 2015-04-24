import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class lab12 {
 public static void main(String[] arg) {
 Random rand = new Random();
 int randomWidth = rand.nextInt(6)+1;
 int randomHeight = rand.nextInt(6)+1;
 int randomWidth2 = rand.nextInt(6)+1;
 int randomHeight2 = rand.nextInt(6)+1;
 
 int [][] rowArray = increasingMatrix(randomWidth, randomHeight, true);
 printMatrix(rowArray, true);
 int [][] columnArray = increasingMatrix(randomWidth, randomHeight, false);
 printMatrix(columnArray, false);
 int [][] cArray = increasingMatrix(randomWidth2, randomHeight2, true);
 printMatrix(cArray, true);
 
 addMatrix(rowArray,true,columnArray,false);
 addMatrix(rowArray,true,cArray,true);
 
 }

 public static int[][] increasingMatrix(int width, int height, boolean format) {
  int[][] array = new int [height][];
  for (int i = 0; i < array.length; i++) {
    array[i] = new int[width];
   }
  System.out.println("Generating a matrix with width "+width+" and height "+height+":");
  if (format == true) {
   //row major format;
   
   int number = 1;
   for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
     array[i][j] = number;
     number++;
    }
   }
  }

  else {
   //column major format; !!!!!

   for (int i = 0; i < array.length; i++){
   for (int j = 0; j < array[0].length; j++) {
  
   array[i][j] = j*width+(i+1);
  
   }
  }
  }
  
  return array;
 }
 public static void printMatrix(int[][]array, boolean format) {

  
  if(array == null) {
   System.out.println("the array was empty!");
  }
  
  else{
  
 if (format == false) {
  int [][]newarray = translate(array);
  for (int i = 0; i < newarray.length; i++){
  System.out.print("[ ");
  for (int j = 0; j < newarray[i].length; j++){
   System.out.print(newarray[i][j]+" ");
  }
  System.out.println("]");
  }
 }
  

 
 else{
   for (int i = 0; i < array.length; i++){
  System.out.print("[ ");
  for (int j = 0; j < array[i].length; j++){
   System.out.print(array[i][j]+" ");
  }
  System.out.println("]");
  }
 }
  }
  
  
  
  
 }
 public static int[][] translate(int[][]array) {
  System.out.println("Translating column major to row major input.");
  int [][] newArray = new int [array.length][array[0].length];
  int number = 0;
 for (int i = 0; i < array.length; i++) {
  for(int j = 0; j < array[0].length; j++){
   newArray [i][j] = array[j][i];
  }
 }
 
 return newArray;
 }
 public static int[][] addMatrix(int[][]a, boolean formata, int[][]b, boolean formatb){
 System.out.println("Adding two matrices.");
 printMatrix(a,formata);
 System.out.println("plus");
 printMatrix(b,formatb);
  int [][] addArray;
  
  if (formata != true) {
   translate(a);
  }
  
  if (formatb != true) {
   translate(b);
  }
  
  int widthA = a[0].length;
  int widthB = b[0].length;
  int heightA = a.length;
  int heightB = b.length;
  
  if (widthA != widthB || heightA != heightB) {
   System.out.println("the arrays cannot be added!");
   return null;
  }
  
  else {
   addArray = new int [heightA][widthA];
   for (int i = 0; i < addArray.length; i++) {
    
    for(int j = 0; j < addArray[0].length; j++) {
     addArray[i][j] = a[i][j] + b[i][j];
    }
   }
  }
  
  System.out.println("output:");
  printMatrix(addArray, true);
  return addArray;
  
 }
 
}
