// 2.Take array input from the user and print it using  for loop.
import java.util.Scanner;
public class TakingInputFromUser {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

       // Asking the user for the size of the array(rollNumber of students).
        System.out.print("Please enter the total number of student in class : ");
        int size = sc.nextInt();

        //Create an integer array(rollNumber) of given size.
        int[] rollNumber = new int[size];

        // Taking input for rollNumber for all students.
        System.out.println("PLease enter the Roll Numbers of all students of class : ");
        for (int element = 0; element < size; element++){
            rollNumber[element] = sc.nextInt();
        }

        //Printing the elements of  array(rollNumber).
        System.out.println("Roll Numbers of all the student of class : ");
        for (int display = 0; display < size; display++){
             System.out.println(rollNumber[display]);
            }
        }
    }

