/* Calculator Declare int a , b  and char op = '+';  Use switch-case to perform addition,
   subtraction, multiplication, or division based on op value. */
import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);

        //Taking Number 1 from user.
        System.out.print("Enter number 1 : ");
        float a = input.nextInt();
        //Taking Number 2 from user.
        System.out.print("Enter number 2 : ");
        float b = input.nextInt();

        //Asking for operation.
        System.out.print("Select an operation (+,-,*,/) : ");
        char op = input.next().charAt(0);

        //switch Case for calculating the value.
        switch (op) {
            case '+': {
                System.out.println("Result = " + (a + b));
            }
            break;

            case '-': {
                System.out.println("Result = " + (a - b));
            }
            break;

            case '*': {
                System.out.println("Result = " + (a * b));
            }
            break;

            case '/': {
                System.out.println("Result = " + (a / b));
            }
            break;
        }
        }
}
