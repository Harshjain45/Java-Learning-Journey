/* Number Sign & Range Checker Declare int num . Print:
   - 'Positive and even/odd' if > 0-
   - 'Negative and even/odd' if < 0
   - 'Zero' if num == 0. */
import java.util.Scanner;
public class RangeChecker {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);

        //Taking input.
        System.out.print("Please enter an Number to check Range : ");
        float number = input.nextFloat();

        //Applying the condition.
        if (number>0 && number%2==0)
        {System.out.println("Entered number is Positive and Even");}

        else if (number>0 && number%2!=0)
        {System.out.println("Entered number is Positive and Odd");}

        else if (number<0 && number%2==0)
        {System.out.println("Entered number is Negative and Odd");}

        else if (number<0 && number%2!=0)
        {System.out.println("Entered number is Negative and Odd");}

        else if (number==0)
        {System.out.println("Entered Number is Zero");}

        else
        {System.out.println("Invalid operation");}
    }
}
