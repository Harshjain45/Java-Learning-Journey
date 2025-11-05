/* Voting Check with Message:Declare String person = ""; int age= ;
   Print: "<name> is not eligible to vote" if age < 18. Else print: "Ravi is eligible to vote".*/
import java.util.Scanner;

public class VotingEligiblityCheck {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc = new Scanner(System.in);

        //Taking users' Name.
        System.out.print("Please enter your name : ");
        String name = sc.next();

        //Taking users age.
        System.out.print("Please enter your age : ");
        float age = sc.nextFloat();

        //Printing if eligible for voting or not.
        if (age < 18){
            System.out.println(name + " is not eligible to vote");
        }
        else {
            System.out.println(name + " is eligible to vote.");
        }
    }
}
