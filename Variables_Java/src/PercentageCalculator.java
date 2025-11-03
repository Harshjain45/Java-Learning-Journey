/*  Write a program to calculate the Percentage of a student in CBSE board Exam.
   his/her marks of 5 Subjects taken from keyboard */
import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        //Importing Scanner
        Scanner input = new Scanner(System.in);

        //Asking for marks of each subject.
        System.out.println("Enter marks of each subject out of 100");

        // Subject 1.
        System.out.print("Subject 1 : ");
        float Sub1 = input.nextInt();

        // Subject 2.
        System.out.print("Subject 2 : ");
        float Sub2 = input.nextInt();

        // Subject 3.
        System.out.print("Subject 3 : ");
        float Sub3 = input.nextInt();

        // Subject 4.
        System.out.print("Subject 4 : ");
        float Sub4 = input.nextInt();

        // Subject 5.
        System.out.print("Subject 5 : ");
        float Sub5 = input.nextInt();

        // Percentage.
        float percentage = (Sub1 + Sub2 + Sub3 + Sub4 + Sub5 ) / 5;
        System.out.print("Total Percentage : " + percentage + "%");
    }
}
