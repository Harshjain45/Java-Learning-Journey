/*
   Floyd's Triangle
     1
     2 3
     4 5 6
     7 8 9 10
 */
public class FloydTriangle {
    public static void main(String[] args) {
           //Number of rows.
             int rows = 4;
             int num = 1;
            //Outer loop.
             for (int row = 1; row <= rows; row++){

             //Inner loops.
             for (int col = 1; col <= row; col++){
                 System.out.print(num + " ");
                 num++;
             }
                 System.out.println(" ");
        }
    }
}
