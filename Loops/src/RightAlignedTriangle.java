/* Right-Aligned Triangle
        *
       **
      ***
     ****
*/
public class RightAlignedTriangle {
    public static void main(String[] args) {

        //Number of rows.
        int rows = 4;

        //Using for nested for loop to print Right-Aligned Triangle.
        //Outer loop.
            for (int row = 1; row <= rows; row++){
            //inner loop print space.
            for (int space = 1; space <= (rows-row); space++) {
                System.out.print(" ");
            }
            //inner loop print star.
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
