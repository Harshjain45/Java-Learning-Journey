/*
 Solid Rectangle
 ****
 ****
 ****
 */
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Number of rows.
        System.out.print("Enter the number of rows in Solid Rectangle : ");
        int rows = sc.nextInt();

        //Number of columns.
        System.out.print("Enter the number of columns in Solid Rectangle : ");
        int cols = sc.nextInt();

        //Printing Solid rectangle as per requirement.
        System.out.println("Solid Rectangle having " + rows + " Rows and " + cols + " Columns");
        for (int row = 1; row <= rows; row++ ) {

            for (int col = 1; col <= cols; col++) {

                System.out.print("*"); }

                System.out.println(" ");

           }
        sc.close();
        }
       }
