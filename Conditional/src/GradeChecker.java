/* Grade Checker Declares int marks. Use else-if to print grades:
     - A (>=90), B (>=80), C (>=70), D (>=60), F (<60) */
import java.util.Scanner;
public class GradeChecker {
    public static void main(String[] args) {
        //Importing Scanner
        Scanner input = new Scanner(System.in);

        //Taking Input Marks From User.
        System.out.print("Please Enter Your Marks (Out of 100) : ");
        float marks = input.nextFloat();

        //Applying grade condition using If-else.
        if (marks>=90){
            System.out.println("Your Grade = A");
        }
        else if (marks>=80) {
            System.out.println("Your Grade = B");
        }
        else if (marks>=70) {
            System.out.println("Your Grade = C");
        }
        else if (marks>=60) {
            System.out.println("Your Grade = D");
        }
        else {
            System.out.println("Your Grade = F");
        }
    }
}
