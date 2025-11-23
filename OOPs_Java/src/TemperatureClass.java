//12.Create a class Temperature with attribute Celsius. Write a method toFahrenheit()
import java.util.Scanner;
public class TemperatureClass {
    //Temperature class.
    static class Temperature{
        float celsius;
        //toFahrenheit method.
        public float toFahrenheit(){
            return ( ( (celsius) * 9 / 5 ) + 32);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Temperature temperature = new Temperature();//Instantiation new Temperature class.

        //Asking for attributes.
        System.out.println("Celsius To Fahrenheit Converter");
        System.out.print("Enter Temperature in celsius : ");
        temperature.celsius = sc.nextFloat();

        //Calling toFahrenheit method.
        float fahrenheit = temperature.toFahrenheit();
        System.out.println("Temperature In Fahrenheit : " + fahrenheit );
        sc.close();//Closing Scanner.
    }
}
