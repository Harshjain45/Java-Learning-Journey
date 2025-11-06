/* Half Pyramid.
   *
   **
   ***
   ****
*/
public class HalfPyramid {
    public static void main(String[] args) {

        //Total number of rows.
        int rows = 4;

        //Using nested for loop to print the required Half Pyramid.
        for(int row = 1; row <= rows; row++){

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
