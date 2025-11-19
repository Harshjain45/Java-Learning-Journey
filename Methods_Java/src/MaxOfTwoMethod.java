//5.Write a method maxOfTwo(int a, int b) that returns the larger number.
import java.util.Scanner;
public class MaxOfTwoMethod {

    static int maxOfTwo(int num1 , int num2){
        return Math.max(num1 , num2);
    }

    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.println("Please enter Two integers");
        System.out.print("Please enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.print("Please enter number 2 : ");
        int number2 = sc.nextInt();

        //Method calling.
        System.out.println( "Max number out of two entered numbers : " + maxOfTwo(number1,number2));
    }
}
