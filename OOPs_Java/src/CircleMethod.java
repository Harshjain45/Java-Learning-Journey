//8.Create a class Circle with attribute radius. Write methods area() and circumference().
import java.util.Scanner;
public class CircleMethod {
    //Circle class.
    static class Circle{
        float radius;
        //Area Method.
        public float area(){
            return (float) (radius * radius * Math.PI);
        }
            //Circumference Method.
            public double circumference(){
            return (double) (2 * Math.PI * radius);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Custom Circle Class:");
        Circle circle = new Circle(); //Instantaiting new circle class.
        //Asking for Attributes.
        System.out.print("Please Enter the Radius of Circle : ");
        circle.radius = sc.nextFloat();

        //Printing area of Circle.
        float area = circle.area();
        System.out.println("Area of Circle : " + area);

        //Printing circumference of Circle.
        double circumference = circle.circumference();
        System.out.println("Circumference of Circle : " + circumference);
        sc.close();
    }
}
