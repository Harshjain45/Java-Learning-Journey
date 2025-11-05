/* Welcome Message Take two variables: String name =, int age =.
   Print:Hello <name>, you are <age> years old.*/
import java.util.Scanner;
public class WelcomeMessage {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Taking input Name from user.
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();

        //Taking input Age from user.
        System.out.print("Please enter your age : ");
        float age = sc.nextFloat();

        //Welcoming the user.
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
