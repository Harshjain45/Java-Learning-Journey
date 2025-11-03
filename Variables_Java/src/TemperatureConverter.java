/* Declare a celsius temperature celsius=36.5.
   Convert it to Fahrenheit using: F=(celsius*9/5)+32. */
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc=new Scanner(System.in);

        //Taking temperature.
        System.out.print("Temperature in celsius : ");
        double tem= sc.nextDouble();

        //Formula for converting Celsius to Fahrenheit.
        double F = ( tem * 9/5 ) + 32;
        System.out.println("Temperature in Fahrenheit : "+F+" F");
    }
}
