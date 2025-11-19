//1.Write a method greet() that prints a welcome message.
import java.util.Scanner;
public class GreetingMethod {

       //Creating a greetMethod.
       static void Greet(){

          Scanner sc = new Scanner(System.in); //Importing Scanner.

          System.out.print("Please enter your name : "); //User input for name.
          String name = sc.nextLine();

          System.out.println("Hello , " + name + "have a nice day.");
      }

    public static void main(String[] args) {

          //Calling method.
        Greet();
    }
}
