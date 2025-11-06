/* Sum of first N natural numbers
   Input from user: int n =; */
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Taking input n from user.
        System.out.print("Please enter a number to find the sum of natural numbers up to that number: ");
        int n = sc.nextInt();

        //Variable for adding.
        int sum = 0;

        //for loop to find the Sum of n natural number.
        for (int num = 0; num<=n; num++){
            sum = sum+num;
        }
        System.out.println("Sum natural numbers upto "+ n + " : " + sum);
    }
}

/*
logic
sum=0 means starting counting from nothing
and sum+num.
num=1,2,3 and so on.
sum = starts with 0.
and 0+1=1
    1+2=3
    3+3=6
    and so on
 */