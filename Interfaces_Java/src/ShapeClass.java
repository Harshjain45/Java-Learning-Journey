/*1.Shape(Abstract Class)
Create an abstract class Shape with abstract method area().
Create Circle and Rectangle that implement area().
Call them using runtime polymorphism.*/
//Shape Abstract Class.
import java.util.Scanner;
abstract class Shape{
    //Abstract area method.
    public abstract float area(float radius , float length, float breadth);

    public void draw() {
    }
}
//Derived Circle Class.
class Circle extends Shape {
   public float area(float radius , float length , float breadth){
      return (float) (Math.PI * radius * radius);
   }
}
//Derived Rectangle Class.
class Rectangle extends Shape {
    public float area(float radius , float length , float breadth){
        return (float) (length * breadth);
    }
}

public class ShapeClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User Input.
        System.out.println("Please enter dimension of Following Shapes:");
        System.out.println("Rectangle:");
        System.out.print("Please enter length of rectangle : ");
        float length = sc.nextFloat(); //Length input.
        System.out.print("Please enter Breadth of rectangle : ");
        float breadth = sc.nextFloat(); //Breadth input.
        System.out.println("Circle:");
        System.out.print("Please enter Radius of circle : ");
        float radius = sc.nextFloat(); //Radius input.
        System.out.println();

        Shape rectangle = new Rectangle(); //Object creation.
        System.out.println("Area of Rectangle : " + rectangle.area(0,length,breadth)); //Calling area method.

        Shape circle = new Circle(); //Object creation.
        System.out.println("Area of Circle : " + circle.area(radius,0,0)); //Calling area method.
        sc.close(); //Closing Scanner.
    }
}
