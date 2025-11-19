//4.Create a method printName(String name) that prints your name 5 times.
import java.util.Scanner;
import java.util.Stack;

public class PrintNameMethod {

    static void printName(String name){
        for (int num = 0; num < 5; num++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //User Input.
        System.out.print("Please enter your name : ");
        String yourname = sc.next();

        //Calling method.
        printName(yourname);
    }
}
