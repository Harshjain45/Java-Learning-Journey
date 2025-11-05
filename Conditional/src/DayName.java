/* Day of the Week Declare int. Use a Switch-case to print the day name
        (1=Monday, ..., 7=Sunday). */
import java.util.Scanner;
public class DayName {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);

        //Taking day number from user.
        System.out.print("Enter the day number to know day name (from 1 to 7) : ");
        int day = input.nextInt();

        //Applying switch-case.
        switch (day)
        {
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;
        }
    }
}
