// Reverse a number.
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user.
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        int originalnumber = number;

        //Storing reverse.
        int reverse = 0;

        //Reversing number using while loop.
        while (number > 0){
           int lastdigit = number % 10; // extracting the last digit.
               reverse = reverse * 10 + lastdigit; // adding it to reverse.
               number = number / 10; //removing last digit.
        }
        System.out.println("Reverse of " + originalnumber + " : " + reverse); //Printing the reverse.
    }
}
