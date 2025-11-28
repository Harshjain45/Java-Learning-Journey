/*3.Create a class Rectangle with length and breadth Write:
> A parameterized constructor
> A method to compute area
> Create 2 objects with different values
*/
import java.util.Scanner;
public class RectangleClass {
    //Rectangle class.
    static class Rectangle{
        double length;
        double breadth;
        //Constructor.
        Rectangle(double length , double breadth){
            this.breadth = breadth;
            this.length = length;
        }
        //Area method.
        public double area(){
            return length * breadth;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter the length of first rectangle : ");
        double length1 = sc.nextDouble();
        System.out.print("Please enter the breadth of first rectangle : ");
        double breadth1 = sc.nextDouble();
        System.out.print("Please enter the length of second rectangle : ");
        double length2 = sc.nextDouble();
        System.out.print("Please enter the breadth of second rectangle : ");
        double breadth2 = sc.nextDouble();

        //Object 1.
        Rectangle r1 = new Rectangle(length1,breadth1);
        //Calling area method.
        double arear1 = r1.area();
        System.out.println("Area of first Rectangle : " + arear1);

        //Object 2.
        Rectangle r2 = new Rectangle(length2,breadth2);
        //Calling area method.
        double arear2 = r2.area();
        System.out.println("Area of Second Rectangle : " + arear2);
        sc.close();//Closing the Scanner.
    }
}
