//2. Create a method add(int a, int b) that returns the sum.
import java.util.Scanner;
public class SumMethod {
    static int sum(int num1 , int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {

        //Importing the Scanner.
        Scanner sc = new Scanner(System.in);

        //Number input.
        System.out.println("Please enter two Integers : ");

        //Number 1.
        System.out.print("Enter the Number 1 : ");
        int number1 = sc.nextInt();

        //Number 2.
        System.out.print("Enter the Number 2 : ");
        int number2 = sc.nextInt();

        //Printing sum of two numbers using method.
        int result = sum(number1, number2); //Calling sum method.
        System.out.println("Sum of the two integers : " + result);

        sc.close(); //Closing the scanner.
    }
}
