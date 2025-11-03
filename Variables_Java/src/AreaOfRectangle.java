/* Write a Java program using Scanner to input the length and width of a
   rectangle, calculate its area, and print the result. */
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {

        //Importing the Scanner.
        Scanner sc = new Scanner(System.in);

        //Taking Length.
        System.out.print("Enter length : ");
        double Length = sc.nextDouble();

        //Taking Width.
        System.out.print("Enter Width : ");
        double Width = sc.nextDouble();

        //Calculating Area.
        double Area = ( Length * Width );
        System.out.println("Area of given Rectangle : " + Area );
    }
}
