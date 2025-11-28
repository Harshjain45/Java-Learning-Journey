/*10.Create a class Temperature with Celsius value.
Write a constructor
Add method toFahrenheit()
*/
import java.util.Scanner;
public class TemperatureClass {
    //Temperature class.
    static class Temperature{
        float celsius;
        //constructor.
        Temperature(float celsius){
            this.celsius = celsius;
        }
        //toFahrenheit method.
        public double toFahrenheit(){
            return  ( (celsius* 9/5) + 32);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Enter temperature in celsius : ");
        float temp = sc.nextFloat();

        Temperature temperature = new Temperature(temp);//Creating object.
        System.out.println("Temperature in Fahrenheit : " + temperature.toFahrenheit() + "°F");
    }
}
