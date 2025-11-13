//Find the sum of all elements in a 2D array.
import java.util.Arrays;
import java.util.Scanner;
public class SumOfElementsIn2DArray {
    public static void main(String[] args) {

        //importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size of 2D integer array.
        //Asking for number of rows.
        System.out.print("Please enter the number of rows of 2D integer array : ");
        int row = sc.nextInt();

        //Asking for number of columns.
        System.out.print("Please enter the number of columns of 2D integer array : ");
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

        //Printing array elements.
        System.out.println("2D Integer array elements : " + Arrays.deepToString(twoDArray));

        //Storing the sum of 2D Integer array.
        int sum = 0;

        //Summing elements of 2D Integer array using two loops.
        for (int rowsum = 0; rowsum < row; rowsum++){
            for (int colsum = 0; colsum < column; colsum++){
               sum += twoDArray[rowsum][colsum];
            }
        }
        System.out.println("Sum of elements of 2D integer array : " + sum);
    }
}
