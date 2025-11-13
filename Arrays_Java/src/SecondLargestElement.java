//7.Find the Second-Largest element in an array.
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the total number of the students in the class.
        System.out.print("Please enter the total number of students in class : ");
        int numberOfStudents = sc.nextInt();

        //Declaring an array of marks of the students in class.
          float[] marks = new float[numberOfStudents];

        //Asking for marks of all the students in class using for loop.
        System.out.println("Please enter the marks of all the students in class : ");
        for(int mark = 0; mark < numberOfStudents; mark++){
            marks[mark] = sc.nextFloat();
        }

        //Assuming an element first to be the largest element.
        float largest = marks[0];

        //Finding the largest element using for loop.
        for(int maximum = 1; maximum < numberOfStudents; maximum++){
              if(marks[maximum] > largest){
                  largest = marks[maximum];
              }
        }

        //Printing the largest value.
        System.out.print("Highest marks scored in class : " + largest );

       // Assuming the second-largest value to be the minimum value, an array can have.
        float secondlargest = Float.NEGATIVE_INFINITY;

       // Finding the second-largest value using for loop.
        for(int secondmaximum = 0; secondmaximum < numberOfStudents; secondmaximum++){
            if (marks[secondmaximum] > secondlargest && marks[secondmaximum] < largest ){
                secondlargest = marks[secondmaximum];
            }
        }

      //Printing the second-largest value of an array.
        System.out.println();
        System.out.print("Second highest marks scored in class : "+ secondlargest);
    }
}
