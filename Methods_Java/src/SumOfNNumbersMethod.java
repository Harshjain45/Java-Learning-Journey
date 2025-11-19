//14. Write a recursive method sumN(int n) that returns the sum of first n natural numbers.
import java.util.Scanner;
public class SumOfNNumbersMethod {

    static int sumN(int n){
        if (n == 0) {
            return 0;
        }
        return n + sumN(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter a natural number : ");
        int number = sc.nextInt();

        //Calling method.
        int sum = sumN(number);

        //Printing sum of n natural number.
        System.out.print("Sum of first " + number + " natural numbers : " + sum);
    }
}
