/*
   Inverted Pyramid
     ****
     ***
     **
     *
   */
public class InvertedPyramid {
    public static void main(String[] args) {
        //Total number of rows.
        int rows = 4;

        //Using nested for loop to print the required Half Pyramid.
        for(int row = 1; row <= rows; row++){

            for(int col = rows; col >= row; col--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
