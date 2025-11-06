//Count digits in a number.
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

          //Importing Scanner.
         Scanner sc = new Scanner(System.in);

          //Taking number input.
         System.out.print("Please enter a number : ");
         int number = sc.nextInt();
         int originalnumber = number;

          //Counter.
         int count = 0;

         //Counting the number of digits using for while.
          while (number > 0){
              number = number / 10;
              count++;
          }

          //Printing number of digits.
        System.out.println("Total number of digits in " + originalnumber + " : " + count + ".");
    }
}
