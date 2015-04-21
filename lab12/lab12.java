//
//
import java.util.Random;

public class lab12 {
    public static void main(String[] args) {

        //random integers and boolean
        Random rand = new Random();
        int numRandom = rand.nextInt((5 - 1) + 1) + 1;
        int numRandom2 = rand.nextInt((5 - 1) + 1) + 1;
        int numRandom3 = rand.nextInt((5 - 1) + 1) + 1;
        int numRandom4 = rand.nextInt((5 - 1) + 1) + 1;
        boolean format = rand.nextBoolean();

        int[][] array = increasingMatrix(numRandom, numRandom2, format);
        int[][] array2 = increasingMatrix(numRandom, numRandom2, format);


        System.out.println("Generating new matrix A with width of " + numRandom + " and length of " + numRandom2 + ".");

        printMatrix(array, format);
        System.out.println("");

        System.out.println("Generating new matrix B with width of " + numRandom + " and length of " + numRandom2 + ".");
        printMatrix(array2, format);

    }

    public static int[][] increasingMatrix(int width, int height, boolean format) {
        //creates the new array as these parameters

        int[][] array = new int[height][width];

        int number = 1;

        if (format == true) {

            for (int row = 0; row < array.length; row++) {

                for (int column = 0; column < array[row].length; column++) {

                    array[row][column] = number;
                    number++;
                }
            }

        }


        //column-major
        if (format == false) {

            for (int column = 0; column < width; column++) {

                for (int row = 0; row < array.length; row++) {

                    array[row][column] = number;
                    number = column + 1 + width;


                }

            }


        }


        return array;
    }



    public static void printMatrix(int[][] array, boolean format) {
        if (format == true) {


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

        else if (format == false) {

        }
    }

    // translate

    public static void translate(int[][] array) {
        //Reads input matrix and copies its values into a newly allocated array in row major format.
        //output the new array.

    }

    //add Matrix
    //accepts two arrays in row or column-major format
    //assess if arrays can be added
    //same width and height
    //if they can't be added then prints "The arrays cannot be added" and returns null

    public static void addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb) {

    }

}