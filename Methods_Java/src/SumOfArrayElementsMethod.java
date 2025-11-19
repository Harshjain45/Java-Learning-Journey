//8.Write a method sumArray(int[] arr) that returns the total sum of all array elements.
import java.util.Arrays;
import java.util.Scanner;
public class SumOfArrayElementsMethod {
    static int sumArray(int[] arr){
        int sum = 0; //Stores sum.
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking the size of the array of integers.
        System.out.print("Please enter the size of array of integers : ");
        int size = sc.nextInt();

        //Declaring an array of integers.
        int[] array = new int[size];

        //Taking elements from user.
        System.out.println("Please enter the elements of array of Integers : ");
        for(int elements = 0; elements < size; elements++){
            array[elements] = sc.nextInt();
        }

        //Displaying all array elements.
        System.out.println("All entered elements " + Arrays.toString(array));

        //Calling sumArray method.
        System.out.println("Sum of all the entered elements : " + sumArray(array));
    }
}
