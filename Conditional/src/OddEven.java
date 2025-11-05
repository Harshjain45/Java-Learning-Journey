/* Odd or Even Declare an int num = 7.
   Use if-else to check if the number is odd or even. */
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);

        //Taking input from user.
        System.out.print(" Please Enter an Integer : ");
        int number = input.nextInt();

        //if else condition.
        if ( number % 2 == 0 ){
            System.out.println(" The entered value is Even. ");
        }
        else {
            System.out.println(" The entered value is Odd. ");
        }
    }
}
