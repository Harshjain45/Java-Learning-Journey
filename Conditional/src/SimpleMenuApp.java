/* Simple Menu App Use switch-case to display options:
   1. Print Hello
   2. Print Date
   3. Exit
   Take int input for choice and respond accordingly. */
import java.time.LocalDate;
import java.util.Scanner;
public class SimpleMenuApp {
        public static void main(String[] args) {
            //Importing LocalDate.
            LocalDate date= LocalDate.now();
            //Importing Scanner.
            Scanner sc = new Scanner(System.in);

            //Taking input from user.
            System.out.print("Enter 1 for greet, Enter 2 for date, Enter 3 for Exit : ");
            int number = sc.nextInt();

            //Applying condition.
            switch(number){
                case 1:
                    System.out.println("Hello.");
                    break;
                case 2:
                    System.out.println(date);
                    break;
                case 3:
                    System.out.println("Thankyou.");
                    break;
                default:
                    System.out.println("Sorry invalid entry.");
            }
        }
    }


