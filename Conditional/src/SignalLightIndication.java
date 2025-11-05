/* Traffic Light System Declare a String signal.Use if-else to print:
   - 'Go' if green
   - 'Wait' if yellow
   - 'Stop' if red
   - 'Invalid signal' otherwise. */
import java.util.Scanner;
public class SignalLightIndication {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);
        //taking signal input.
        System.out.print("Please enter the signal light (Green,Yellow,Red) : ");
        String light = input.nextLine();

        //Signal light meaning.
         if (light.equalsIgnoreCase("green"))
         {System.out.println("Green light means you  can [Go].");}

         else if (light.equalsIgnoreCase("yellow"))
         {System.out.println("Yellow light means you have to [Wait].");}

         else if (light.equalsIgnoreCase("red"))
         {System.out.println("Red light means you have to [Stop].");}
         else {
             System.out.println("Invalid signal.");
         }
    }
}
