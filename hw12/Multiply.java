//

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        boolean primaryCheck = true;
        int width = 0;
        int height = 0;
        int width2 = 0;
        int height2 = 0;
        int counter = 0;
        int counter2 = 0;

        do {
            //  Tells user to enter 2 positive integer values
            System.out.println("Please enter 2 positive integer values for width & height of matrix 1");

            Scanner scan = new Scanner(System.in);

            //Checks to make sure value is positive and integer

            while (counter < 2) {

                if (!scan.hasNextInt()) {
                    System.out.println("Invalid input. Please reenter width & height.");
                    counter = 0;
                    scan.next();
                }
                
                else if (counter == 0) {
                    width = scan.nextInt();
                    counter++;
                    
                    
                }
                
                else if (counter == 1) {
                    height = scan.nextInt();
                    counter++;
                  
                    break;
                }
                
                
            }


            //Prompts user to enter values for matrix 2
            System.out.println("Please enter 2 positive integer values for width & height of matrix 2");

            while (counter2 < 2) {

                if (!scan.hasNextInt()) {
                    System.out.println("Invalid input. Please reenter width & height.");
                    counter2 = 0;
                    scan.next();
                }
                else if (counter2 == 0) {
                    width2 = scan.nextInt();
                    counter2++;
                    
                }
                
                else if (counter2 == 1) {
                    height2 = scan.nextInt();
                    counter2++;
                   
                    break;
                }
                
            }

            if (width != height2) {
                System.out.println("Matrices cannot be multipled together.");
                counter = 0;
                counter2 = 0;
            }

            else {
                primaryCheck = false;
            }
        }
        while (primaryCheck);

        //creates new array 1 & 2
        int array[][] = randomMatrix(width, height);
        int array2[][] = randomMatrix(width2, height2);

        // Prints out the Matrix
        printMatrix(array);
        System.out.println("========");
        printMatrix(array2);

        // Multiplies matrices
        System.out.println("========");
        int[][] theMatrix = matrixMultiply(array, array2);
        printMatrix(theMatrix);



    }

    //  new method generates randomMatrix with variable integers -10 and 10

    public static int[][] randomMatrix(int width, int height) {

        // Generates random integer between -10 and 10;
        // (max-min+1)+min;
        Random rand = new Random();

        int numRandom = rand.nextInt(21) - 10;
        //Creates new array of height and width. Fills with random int
        int array[][] = new int[height][width];

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {

                array[row][column] = numRandom;

                // Creates a new random variable
                numRandom = rand.nextInt(21) - 10;

            }
        }


        return array;
    }

    //Prints out matrixes
    public static void printMatrix(int[][] array) {



        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println("");
        }


    }

    //Multiplies the matrices
    public static int[][] matrixMultiply(int[][] array, int[][] array2) {

        int newArray[][] = new int[array.length][array2[0].length];





        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array2[0].length; column++) {
                for (int k = 0; k < array[row].length; k++) {
                    newArray[row][column] = newArray[row][column] + array[row][k] * array2[k][column];
                }
            }
        }




        return newArray;

    }










}