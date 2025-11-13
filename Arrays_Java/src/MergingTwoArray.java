//11.Merge two arrays into a third array and print the result.
import java.util.Arrays;
import java.util.Scanner;
public class MergingTwoArray {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size of the First integer array.
        System.out.print("Please enter the size of first integer array : ");
        int size1 = sc.nextInt();

        //Declaring the first integer array.
          int[] array1 = new int[size1];

        //Asking elements of the first array.
        System.out.println("Please enter the elements of first integer array : ");
        for (int element1 = 0; element1 < size1; element1++){
             array1[element1] = sc.nextInt();
        }

        //Asking for the size of the second integer array.
        System.out.print("Please enter the size of Second integer array : ");
        int size2 = sc.nextInt();

        //Declaring the first integer array.
        int[] array2 = new int[size2];

        //Asking elements of the first array.
        System.out.println("Please enter the elements of first integer array : ");
        for (int element2 = 0; element2 < size2; element2++){
            array2[element2] = sc.nextInt();
        }

        //Printing the elements of the first integer array using too.string.
        System.out.println("Elements of first integer array : " + Arrays.toString(array1));

        //Printing the elements of the Second integer array using too.string.
        System.out.println("Elements of Second integer array : " + Arrays.toString(array2));

        //Declaring the third integer array.
        int[] array3 = new int[size1 + size2];

        //Storing elements of the first integer array in the third array.
        for (int copy1 = 0; copy1 < size1; copy1++){
            array3[copy1] = array1[copy1];
        }

        //Storing elements of the first integer array in the third array.
        for (int copy2 = 0; copy2 < size2; copy2++){
            array3[copy2 + size1] = array2[copy2];
        }

        //Printing the merged third integer array.
        System.out.println("Merged array : " + Arrays.toString(array3));
    }
}
