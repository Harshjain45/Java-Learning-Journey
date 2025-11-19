//9.Create a method search(int[] arr, int key) that returns the index of the key or -1 if not found.
import java.util.Arrays;
import java.util.Scanner;
public class SearchElementmethod {

    static int search(int[] arr , int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                System.out.print("The entered number found at index : ");
                return i;
            }
        }
        return -1;
    }
        public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asking for the size of array of integer.
        System.out.print("Please enter the size of array : ");
        int size = sc.nextInt();

        //Declaring an array of integer.
        int[] array = new int[size];

        //Asking for elements of the array of integer.
        for (int element = 0; element < size; element++){
            array[element] = sc.nextInt();
        }

        //Displaying all the elements of array.
        System.out.println();
        System.out.println("All the element of the array : " + Arrays.toString(array));

        //Asking for the element to search.
            System.out.print("Please enter the number to search in array : ");
            int find = sc.nextInt();

        //calling method.
            int result = search(array,find);
           if (result == -1){
               System.out.println("No such element found in the array.");
           }
           else {
               System.out.println(result);
           }
           sc.close();
    }
}
