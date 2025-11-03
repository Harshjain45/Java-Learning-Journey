/* Write a java program to ask user his/her name,then greet them with "Hello have a great day".*/
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //User Name.
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();

        //Greeting with text.
        System.out.println("Hello "+name+" , have a great day.");
    }
}
