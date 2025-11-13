//12.Count the frequency of a given element in an array.
import java.util.Scanner;
public class FrequencyOfElement {
    public static void main(String[] args) {

        //importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Asking for the size the of integer array form user.
        System.out.print("Please enter the size of integer array : ");
        int size = sc.nextInt();

        //Declaring an array.
        int[] array = new int[size];

        //Asking for elements of the integer array.
        System.out.println("Please enter the elements of integer array : ");
        for (int elements = 0; elements < size; elements++){
            array[elements] = sc.nextInt();
        }

        //Asking for the element to be searched(for frequency).
        System.out.print("Please enter the element that has to searched(frequency) : ");
        int search = sc.nextInt();

        //Storing count of frequency of the element.
        int count = 0;

        //Searching the element's frequency using loop.
        for (int index = 0; index < size; index++){
            if (array[index] == search){
                count++;
                System.out.println(search + " Found at index of integer array : " + index);
            }
        }

        //Total frequency of the element to search.
        System.out.println("Total frequency of " + search + " : " + count);
    }
}
