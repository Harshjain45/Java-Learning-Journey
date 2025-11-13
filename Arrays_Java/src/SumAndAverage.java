//3.Find the sum and average of all elements in an array.
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);


        // Asking the user for the size of the array(marks of students).
        System.out.print("Please enter the total number of student in class : ");
        int size = sc.nextInt();

        //Create an integer array(rollNumber) of given size.
        float[] marks = new float[size];

        // Taking input for marks for all students.
        System.out.println("PLease enter the Marks of all students of class : ");
        for (int element = 0; element < size; element++) {
            marks[element] = sc.nextInt();
        }

        //Printing the sum of arrays elements (Marks of all the students).
        float sums = 0; //Stores the sum of marks
        for (int sum = 0; sum < size; sum++){
            sums += marks[sum];
        }
        System.out.print("The sum of marks of all the students of class : " + sums);
        System.out.println(); //Move to the next line after printing results.

        //Printing the average of all the elements of array(marks of students).
        float average = sums / size;
        System.out.print("The average of marks of all the students of class : " + average);
    }
}

