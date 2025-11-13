//9.Find duplicate elements in an array.
import java.util.Scanner;
public class FindingDuplicateElements {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size of array from user.
        System.out.print("Please enter the size of Integer array : ");
        int size = sc.nextInt();

        //Declaring an array.
        int[] arr = new int[size];

        //Asking for the elements of array from user.
        System.out.println("Please enter the elements of Integer array.");
        for (int element = 0; element < size; element++) {
            arr[element] = sc.nextInt();
        }
         //Assuming no duplicate.
        boolean duplicatefound = false;

        //Finding duplicate using for loop.
        for (int outer = 0;  outer < size; outer++){
            for (int inner = outer + 1; inner < size; inner++){
                if (arr[outer] == arr[inner]){
                    System.out.println("Duplicate element found " + arr[outer]);
                    duplicatefound = true;
                }
            }
        }
        if (!duplicatefound){
            System.out.println("NO duplicate element found");
        }
    }
    }
