//3.Write a method isEven(int n) that returns true or false.
import java.util.Scanner;
public class OddEvenMethod {

    static boolean isEven(int num){
        return num%2 == 0;
    }

    public static void main(String[] args) {

        //Importing the scanner.
        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter a number(Integer) : ");
        int number = sc.nextInt();

        //Calling isEven method.
        boolean result = isEven(number);
        System.out.print("The entered number is even : " + result);
    }
}
