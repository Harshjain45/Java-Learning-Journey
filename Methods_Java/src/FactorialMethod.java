//15.Write a recursive method factorial(int n) to calculate n!.
import java.util.Scanner;
public class FactorialMethod {

    static int factorial(int n){
        if ( n == 0 || n == 1){
            return 1; //base case
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Enter an number(Integer) : ");
        int number = sc.nextInt();

        //Calling method.
        int factorial = factorial(number);

        //Printing factorial of number.
        System.out.println("Factorial of " + number + " is : " + factorial);
    }
}
