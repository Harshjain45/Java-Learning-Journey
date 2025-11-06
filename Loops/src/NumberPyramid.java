/*
  Number Pyramid
     1
     12
     123
     1234
 */
public class NumberPyramid {
        public static void main(String[] args) {

            //Number of rows.
            int rows = 4;
            //Outer loop.
               for(int row = 1; row <= rows; row++){

             //Inner loop.
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
                   System.out.println(" ");
            }
    }
}
