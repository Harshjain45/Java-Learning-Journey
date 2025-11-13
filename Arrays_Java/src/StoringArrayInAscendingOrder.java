//8.Check whether an array is sorted in ascending order or not.
import java.util.Scanner;
public class StoringArrayInAscendingOrder {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for size on an array.
        System.out.print("Please enter the size of the array : ");
        int size = sc.nextInt();

        //Declaring array.
        int[] arr = new int[size];

        //Asking for elements of the array.
        System.out.println("Please enter the elements of array : ");
        for (int element = 0; element < size; element++){
                arr[element] = sc.nextInt();
        }

        //Assuming the array is sorted.
        boolean isSorted = true;

        //Comparing each element with the next one.
        for (int check = 0; check < size-1; check++){
            if (arr[check] > arr[check+1]){
                isSorted = false;
                break;
            }
        }

        //Printing the results.
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }
    }
}
