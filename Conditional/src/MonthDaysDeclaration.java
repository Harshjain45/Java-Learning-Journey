/* Month Days Declare int month = 2.
   Use Switch-Case to print how many days the month has.
   (Use 28 for February, 30/31 for others) */
import java.util.Scanner;
public class MonthDaysDeclaration {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Taking month number from user.
        System.out.print("Enter the month number to know number of days : ");
        int Monthno = sc.nextInt();

        //Applying condition.
        switch (Monthno) {
            case 1:
                System.out.println("January = 31");
                break;
            case 2:
                System.out.println("February = 28");
                break;
            case 3:
                System.out.println("March = 31");
                break;
            case 4:
                System.out.println("April = 30");
                break;
            case 5:
                System.out.println("May = 31");
                break;
            case 6:
                System.out.println("June = 31");
                break;
            case 7:
                System.out.println("July = 31");
                break;
            case 8:
                System.out.println("August = 31");
                break;
            case 9:
                System.out.println("September = 30");
                break;
            case 10:
                System.out.println("October = 31");
                break;
            case 11:
                System.out.println("November = 30");
                break;
            case 12:
                System.out.println("December = 31");
                break;
            default:
                System.out.println("Invalid entry.");
        }
    }
}


