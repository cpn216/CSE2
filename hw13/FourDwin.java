import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class FourDwin   {
    public static void main (String[] args) {

        int x = 0;
        int y = 0;
        int count = 0;
    Scanner scan = new Scanner(System.in);
    //To make sure we get an int X
    System.out.print("Enter an integer X: ");
    while (count == 0)  {
    if(!scan.hasNextInt()){
    System.out.print("Invalid input. Please enter an integer for X : ");
    scan.nextLine(); // clears buffer
    }
    else{
    x = scan.nextInt();
    if(x > 0)   {
    scan.nextLine(); // clears buffer
    count++;
    }
    else{
        scan.nextLine(); // clears buffer
    System.out.print("Please enter an integer X greater than 0 : ");
    continue;
    }
    }
    }
    //To make sure we get an int Y > than X
    System.out.print("Enter an integer Y: ");
    while (count == 1)  {
    
    if(!scan.hasNextInt()){
    System.out.print("Invalid input. Please enter an integer for Y : ");
    scan.nextLine(); // clears buffer
    }
    else{
    y = scan.nextInt();
    if(y > x)   {
    count++;
    scan.nextLine(); // clears buffer
    }
    else{
        scan.nextLine(); // clears buffer
    System.out.print("Please enter an integer Y > X : ");
    continue;
    }
    }
    }
    
    double array[][][][] = create(x,y);
    printArray(array);
    sort4DArray(array);
    statArray(array);
    printArray(array);
    }
    
    public static double[][][][] create(int x, int y)  {
        //Random and misc variables and values;
        Random rand = new Random();
        double ranNum = rand.nextDouble()*31;
        int range = (y-x)+1;
        Random randInt = new Random();
        int var = rand.nextInt(range)+x;
        int var1 = rand.nextInt(range)+x;
        int var2 = rand.nextInt(range)+x;
        int var3 = rand.nextInt(range)+x;
        double [][][][] array = new double[3][][][];
        
        //FILLS first array with random # of subarrays;
        for (int i = 0; i < array.length; i++)  {
        var = rand.nextInt(range)+x;
        array[i] = new double [var][][];
        }
        
        //Fills 2nd array with random # of subarrays;
        for (int i = 0; i < array.length; i++)  {
            for(int j = 0; j < array[i].length; j++)    {
                var = rand.nextInt(range)+x;
                array[i][j] = new double [var][];
            }
        }
        
        //Fills 3rd array with random # of subarrays;
        for (int i = 0; i < array.length; i++)  {
            for(int j = 0; j < array[i].length; j++)    {
                for(int k = 0; k < array[i][j].length; k++){
                    var = rand.nextInt(range)+x;
                array[i][j][k] = new double [var];
                }
            }
        }
        
        //Fills elements of arrays;
        
        for (int i = 0; i < array.length; i++)  {
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    for(int l = 0; l < array[i][j][k].length; l++)  {
                    ranNum = rand.nextDouble()*31;
                    array[i][j][k][l] = ranNum;
                    }
                }
            }
        }

    
    return array;
    }
    //Prints out the array's sum, mean and number of elements
    public static void statArray(double[][][][]array) {
    double sum = 0;
   
    int members = 0;
    double mean = 0;
    
    for(int i = 0; i < array.length; i++)   {
        for(int j = 0; j < array[i].length; j++)    {
            for (int k = 0; k < array[i][j].length; k++){
                for (int l = 0; l < array[i][j][k].length; l++){ 
                   double value = ((array[i][j][k][l])*100.0)/100.0;
                    sum += array[i][j][k][l];
                    members ++;
                    
            }
        }
    }
    }
    
    mean = sum/members;
    System.out.println("Members: "+members);
    System.out.printf("Sum: %.1f",sum);
    System.out.println("");
    System.out.printf("Mean: %.1f", mean);
    System.out.println("");
    
    
    
}
    //Insertion sorts the 4D array.
    public static void sort4DArray(double[][][][]array) {
    //This sorts the 4D Array
    for(int i = 0; i < array.length; i++)   {
        for(int j = 0; j < array[i].length; j++)    {
            for (int k = 0; k < array[i][j].length; k++){
                for (int l = 1; l < array[i][j][k].length; l++){
                    double currentNum = array[i][j][k][l];
                    int m;
                    for(m = l -1; m >= 0 && array[i][j][k][m] > currentNum; m--){
                        array[i][j][k][m+1] = array[i][j][k][m];
                    }
                    array[i][j][k][m+1] = currentNum;
                    
            }
        }
    }
    }
    //This sorts the 3D array
    for(int i = 0; i < array.length; i++)   {
        for(int j = 0; j < array[i].length; j++)    {
            for (int k = 0; k < array[i][j].length; k++){
                //Sorting for the 3D. based on number of elements
                
                
                
        }
    }
    }
    }
    //PRINTS THE ARRAY
    public static void printArray(double[][][][]array)  {
        
        for (int i = 0; i < array.length; i++)  {
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                System.out.print("{");
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print("{");
                    for(int l = 0; l < array[i][j][k].length; l++)  {
                        double value = ((array[i][j][k][l])*100.0)/100.0;
                    System.out.printf("%.1f,", value);
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("]");
        }
        System.out.println("]");
        
    }
    //Sorts 3D array using selection sort
    public static double[][][][] sort3DArray(double[][][][]array) {
        int counter = 0;
        int [] valArray = new int[3];
        double [][][][] newArray = new double [3][][][];
        double [][][][] newArray2 = new double[3][][][];
        int smallest = 0;
        int middle = 0;
        int largest = 0;
        int value = 0;
        int swap = 0;
        int holder = 0;
        
    //This loop determines number of elements in each of the 3 arrays
 
 //Then puts the values of members into its own array;
    for (int i = 0; i < array.length; i++)  {
        int val = 0;
        for (int j = 0; j < array[i].length; j++)   {
            for (int k = 0; k < array[i][j].length; k++){
                for (int l = 0; l < array[i][j][k].length; l++){
                  val++;
                }
            }
        }
        valArray[i] = val;
    }
    
    //Selection array sort..
    for (int i = 0; i < valArray.length - 1; i++)  {

        //Uses the array just found to determine how the swapping works
        int currentMin = valArray[i];
        int currentMinIndex = i;
        
        for (int m = i + 1; m < array.length; m++)  {
        
        if(currentMin > valArray[m])    {
            currentMin = valArray[m]; //the smallest value
            currentMinIndex = m; //Index of the smallest value
        }
 
        }

        //Tells us if we have swapped arrays
        if (currentMinIndex != i)   {
            swap++;//counter for swap
            valArray[currentMinIndex] = valArray[i];
            valArray[i] = currentMin;
        }


        }
    
    
    for (int i= 0; i < valArray.length; i++){
        System.out.println(valArray[i]);
    }
   // Assign newArray the values of smallest, middle, largest and fills array accordingly
    
  
         newArray[0]  = new double [(array[smallest].length)][][];
         newArray[1] = new double [(array[middle].length)][][];
         newArray[2]= new double [(array[largest].length)][][];
         
         for (int i = 0; i < newArray.length; i++)  {
             if (i == 0){
                 for(int j2 = 0; j2 < newArray[i].length; j2++){
                newArray[i][j2] = new double [array[smallest][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray[i].length; j2++) {
                for(int k2 = 0; k2 < newArray[i][j2].length; k2++)    {
                    newArray[i][j2][k2] = new double [array[smallest][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray[i].length; j++)    {
            for (int k = 0; k < newArray[i][j].length; k++) {
                for (int l = 0; l < newArray[i][j][k].length; l++)  {
                    newArray[i][j][k][l] = array[smallest][j][k][l];
                }
            }
        }
                 
             }
             else if (i == 1){
                 for(int j2 = 0; j2 < newArray[i].length; j2++){
                newArray[i][j2] = new double [array[middle][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray[i].length; j2++) {
                for(int k2 = 0; k2 < newArray[i][j2].length; k2++)    {
                    newArray[i][j2][k2] = new double [array[middle][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray[i].length; j++)    {
            for (int k = 0; k < newArray[i][j].length; k++) {
                for (int l = 0; l < newArray[i][j][k].length; l++)  {
                    newArray[i][j][k][l] = array[middle][j][k][l];
                }
            }
        }
                 
             }
             else if (i == 2){
                 for(int j2 = 0; j2 < newArray[i].length; j2++){
                newArray[i][j2] = new double [array[largest][j2].length][];
            }
        //Fills newArray with final elements
            for(int j2 = 0; j2 < newArray[i].length; j2++) {
                for(int k2 = 0; k2 < newArray[i][j2].length; k2++)    {
                    newArray[i][j2][k2] = new double [array[largest][j2][k2].length];
                }
            }
        //Fills values into the new array formed
        for (int j = 0; j < newArray[i].length; j++)    {
            for (int k = 0; k < newArray[i][j].length; k++) {
                for (int l = 0; l < newArray[i][j][k].length; l++)  {
                    newArray[i][j][k][l] = array[largest][j][k][l];
                }
            }
        }
                 
             }
        }
        
        return newArray;
    }
 
    
    } 
    

