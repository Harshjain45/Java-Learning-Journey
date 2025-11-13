//Take input for a 2D array (matrix) and print it in row-column format.
import java.util.Arrays;
import java.util.Scanner;
public class TakingInputIn2DArray {
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

        //Printing the elements of 2D integer array in matrix form.
        System.out.println("Printing 2D array in matrix form : ");
        for (int outer = 0; outer < row; outer++){
            for (int inner = 0; inner < column; inner++){
                System.out.print(twoDArray[outer][inner] + " ");
            }
            System.out.println();
        }

        //Printing the elements of 2D integer array.
        System.out.println("Elements of 2D integer array : " + Arrays.deepToString(twoDArray));

        sc.close();//Closing Scanner.
    }
}
