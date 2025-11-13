//Print only the diagonal elements of a square matrix.
import java.util.Arrays;
import java.util.Scanner;
public class DiagonalElements {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size of 2D integer array.
        //Asking for number of rows.
        System.out.print("Please enter the number of rows of integer array : ");
        int row = sc.nextInt();

        //Asking for number of columns.
        System.out.print("Please enter the number of columns of integer array : ");
        int column = sc.nextInt();

        //Declaring 2D integer array.
        int[][] twoDArray = new int[row][column];

        //Asking for elements of @d integer array.
        System.out.println("Please enter the elements of 2d integer array in matrix form : ");
        for(int rows = 0; rows < row; rows++){

            for (int columns = 0; columns < column; columns++) {

                twoDArray[rows][columns] = sc.nextInt();
            }
        }

        //Printing 2D array all elements using Array.deeptostring().
        System.out.println("2d Integer array all elements : " + Arrays.deepToString(twoDArray));

       //Printing the diagonal elements.
        for (int diagonal = 0; diagonal < row; diagonal++){
              System.out.println( twoDArray[diagonal][diagonal]);
        }
    }
}
