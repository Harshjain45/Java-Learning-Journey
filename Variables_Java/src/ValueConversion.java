/* Write a program to convert Kilometer to Meters. */
import java.util.Scanner;
public class ValueConversion {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc = new Scanner(System.in);
        //Asking for value in kilometers.
        System.out.print("Enter value in Kilometer : ");
        float kilometer = sc.nextFloat();

        //Converting into Meters.
        System.out.print("Converted value in Meter = ");
        float meter = kilometer*1000;

        //Printing the conversion.
        System.out.print(meter + " meters");
    }
}
