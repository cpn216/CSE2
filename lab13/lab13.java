//finish lab 7
import java.util.Random;

public class lab13 {
    public static void main(String[] args) {

        int[][] x = create();
        fill(x);
        display(x);
        sort(x);
        display(x);
        int[][] y = convert(x);
        display(y);


    }

    public static int[][] create() {

        int[][] x = new int[5][];
        for (int i = 0; i < x.length; i++) {
            x[i] = new int[i * 3 + 5];
        }
        return x;

    }
    public static void fill(int[][] x) {
        Random rand = new Random();
        int ranNumber = rand.nextInt(40);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                ranNumber = rand.nextInt(40);
                x[i][j] = ranNumber;
            }

        }

    }
    public static void display(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("row " + (i+1) + ": ");
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
    }
    public static void sort(int[][] x) {
    for(int k = 0; k < x.length; k++)   {
    for(int i = 0; i < x.length - 1; i++)   {
    int currentMin = x[k][i];
    int currentIndex = i;
    for(int j = i+1; j < x.length; j++){
    if (currentMin > x[k][j]){
    currentMin = x[k][j];
    currentIndex = j;
    }
    }
    //SWAP
    if(currentMin != i) {
    x[k][currentIndex] = x[k][i];
    x[k][i] = currentMin;
    }
    }
    }
    }
    public static int[][] convert(int[][]x) {
    int[][] y = new int [5][x[4].length];
    for(int i = 0; i < x.length; i++) {
    for(int j = 0; j < x[i].length; j++)   {
    y[i][j] = x[i][j];
    }
    }
    return y;
    }

}