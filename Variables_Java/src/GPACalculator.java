/* Write a program to calculate GPA using marks of 3 subjects out of 100. */
import java.util.Scanner;
public class GPACalculator {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc = new Scanner(System.in);
        //Asking for marks.
        System.out.println("Enter marks of each subject out of 100");

        // Subject 1.
        System.out.print("Subject 1 : ");
        float Sub1 = sc.nextInt();

        // Subject 2.
        System.out.print("Subject 2 : ");
        float Sub2 = sc.nextInt();

        // Subject 3.
        System.out.print("Subject 3 : ");
        float Sub3 = sc.nextInt();

        // GPA Calculation.
        float GPA = ( Sub1 + Sub2 + Sub3 )/30;
        System.out.print("Total GPA : "+ GPA );
    }
}
