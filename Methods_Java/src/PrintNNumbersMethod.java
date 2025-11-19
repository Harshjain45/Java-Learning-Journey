//13.Write a recursive method printNumbers(int n) that prints numbers from 1 to n.
import java.util.Scanner;
public class PrintNNumbersMethod {

    static void printNumber(int n){
         if (n == 0) return;
         printNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter a natural number : ");
        int number = sc.nextInt();

        //Calling method.
        System.out.println("Natural number from 1 to " + number + " are : ");
        printNumber(number);
    }
}
