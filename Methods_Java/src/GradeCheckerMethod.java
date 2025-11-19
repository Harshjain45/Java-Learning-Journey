/*6. Write a method grade(int marks) that returns:
• A → marks ≥ 90
• B → marks ≥ 75
• C → marks ≥ 50
• Fail → otherwise
*/
import java.util.Scanner;
public class GradeCheckerMethod {

    static String grade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter your marks out of 100 : ");
        int mark = sc.nextInt();

        //Calling grade method.
        String result = grade(mark);

        //Printing the result
        System.out.println("Your grade is : " + result);

        sc.close();
    }
}