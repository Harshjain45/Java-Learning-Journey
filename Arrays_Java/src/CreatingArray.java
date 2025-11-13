//1.Create an array of 5 integers and print all elements using a loop.
public class CreatingArray {
    public static void main(String[] args) {

        //Creating an array of 5 elements.
        int[] rollNumbers = {1, 12, 24, 57 , 157};

        //Printing all elements of array using for loop.
          System.out.print("Roll numbers of 5 students : " );
          for (int display = 0; display < rollNumbers.length ; display++){
              System.out.print( rollNumbers[display]);

            //Avoiding last trailing colma.
            if (display < (rollNumbers.length-1)){
                System.out.print(" , ");
            }
            else {
                System.out.print(" . ");
            }
        }
        // move to the next line after printing all numbers.
        System.out.println();
    }
}
