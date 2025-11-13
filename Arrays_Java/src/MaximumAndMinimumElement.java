//4.Find the maximum and minimum element in an array.
import java.util.Scanner;
public class MaximumAndMinimumElement {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size of the array(marks) from user.
        System.out.print("Please enter the total number of student in class : ");
        int size = sc.nextInt();

        //Declaring an array of the marks of all the students.
          float[] marks = new float[size];

        //Asking for the marks of all students from user.
        System.out.println("Please enter the marks of all the students : ");
        for(int elements = 0; elements < size; elements++){
            marks[elements] = sc.nextFloat();
        }

        //Assuming the first element the of the array to maximum and minimum.
        float maximum = marks[0];
        float minimum = marks[0];

        //Searching for the maximum and minimum element using for loop.
        System.out.print("Maximum marks scored in class : ");
        for(int maxmin = 1; maxmin < size; maxmin++){ //max = 1. because we already assumed index = 0 is maximum.

            if (marks[maxmin] > maximum){
                    maximum =  marks[maxmin];
            }

            if (marks[maxmin] < minimum ){
               minimum =  marks[maxmin];
            }
        }

        //Printing maximum and minimum marks.
        System.out.println("Highest marks scored by a student in class : " + maximum);
        System.out.println("Lowest marks scored by a student in class : " + minimum);
    }
}
