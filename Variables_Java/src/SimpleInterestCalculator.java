/* Simple interset calculator declare principal,rate,and time( in years).
   Calculate simple interset using: SI=(p*r*t)/100.*/
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner sc=new Scanner(System.in);

        //Taking Principle.
        System.out.print("Principle Amount : ");
        float p= sc.nextFloat();

        //Annual Rate.
        System.out.print("Annual Rate : ");
        float r= sc.nextFloat();

        // Taking The Time Period.
        System.out.print("Unit period (in years) : ");
        float t= sc.nextFloat();

        //Calculating Simple Interset.
        float SI=(p*r*t)/100;

        // Printing The Simple Interset.
        System.out.println( "Simple Interest  = " + SI );
    }
}
