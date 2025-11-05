/*  Age Group Declare int age.Use else-if to print:
    - 'Teen' if age is between 13-19
    - 'Adult' if age is 20-59
    - 'Senior' if age is 60 or more
    - 'Child' otherwise. */
import java.util.Scanner;
public class AgeGroupDeclaration {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);

        //taking input from user.
        System.out.print("Please Enter Your Age : ");
        float age = input.nextFloat();

        //Applying condition using if-else.
         if (age>=13 && age<=19){
             System.out.println("Your age group = Teen.");
         }
         else if (age>=20 && age<=59) {
             System.out.println("Your age group = Adult.");
         }
         else if (age>=60) {
             System.out.println("Your age group = Senior.");
         }
         else{
             System.out.println("Your age group = Child.");
         }
    }
}
