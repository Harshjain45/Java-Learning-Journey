/*10. Overload method area() to calculate:
• Area of a circle
• Area of a rectangle
*/
import java.util.Scanner;
public class AreaMethod {
    static double area(double radius){
        return radius*radius*Math.PI;
    }

    static double area(double length, double width){
        return length*width;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Area of circle
        System.out.println("Area of circle");
        System.out.print("Enter the radius of circle : "); //Asking radius of circle.
        double r = sc.nextDouble();
        double areaOfCircle = area(r); //Calling area method to calculate area of circle.
        System.out.println("Area of circle : " + areaOfCircle);

        //Area of Rectangle.
        System.out.println("Area of rectangle : ");
        System.out.print("Enter the Length : "); //Asking length of rectangle.
        double l = sc.nextDouble();
        System.out.print("Enter the Width : "); //Asking breath of rectangle.
        double w = sc.nextDouble();
        double areaOfRecatngle = area(l,w); //Calling area method to calculate area of rectangle.
        System.out.println("Area Of Rectangle : " + areaOfRecatngle);
        sc.close();//Closing Scanner.
        }
    }

