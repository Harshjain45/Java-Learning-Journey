//Multiplication Table Input: n = 7 -> Output: Table of 7 up to 10 times.
public class MultiplicationTable {
    public static void main(String[] args) {

        //Statement.
        System.out.println("Multiplication table of 7 up to 10.");

        // Declaring variable for storing multiplication.
        int mul = 1;

        //Printing table using for loop.
        int n = 7;  //as we will multiply each iteration by 7
        for (int i = 1; i <= 10; i++){
            mul = (i * n);
            System.out.println( i + " x 7 = " + mul );
        }
    }
}
