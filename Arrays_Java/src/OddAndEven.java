//5.Count how many numbers in an array are even and how many are odd.
import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the total number of the students in class from user.
        System.out.print("Please enter the total number of students in class : ");
        int numberOfStudents = sc.nextInt();

        //Declaring an array of rollNumber of students in class.
        int[] rollNumbers = new int[numberOfStudents];

        //Asking for rollNumbers of all the students in class from user.
        System.out.println("Please the Roll Numbers of all the students in class : ");
        for (int rollnumber = 0; rollnumber < numberOfStudents; rollnumber++) {
            rollNumbers[rollnumber] = sc.nextInt();
        }

        //Taking counter for Even rollNumbers.
        int counteven = 0;

        //Taking counter for Odd rollNumbers.
        int countOdd = 0;

        //Searching for Odd and Even rollNumbers using for loop and if-else condition.
        for (int search = 0; search < numberOfStudents; search++) {

            if (rollNumbers[search] % 2 == 0) {
                counteven++;
            }

            if (rollNumbers[search] % 2 != 0) {
                countOdd++;
            }
        }

        //Printing total odd and even rollNumbers.
        System.out.print("Total number of Even Roll Number in class : " + counteven);
        System.out.println(); //Prints a newline.
        System.out.print("Total number of Odd Roll Number in class : " + countOdd);
    }
}