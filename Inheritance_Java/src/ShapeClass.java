/*6.Create class Shape with constructor taking color.
Create a class Circle that takes radius and color (using super).
Print area + color.*/
//Base class.
import java.util.Scanner;
class Shape{
    String colour;
    //Constructor.
    Shape(String colour){
        this.colour = colour;
    }
    //printColour Method.
    public void printColour(){
        System.out.println("Colour Selected : " + colour);
    }
}
//Derived class.
class Circle extends Shape{
    float radius;
    //Constructor.
    Circle(String colour , float radius){
        super(colour);
        this.radius = radius;
    }
    //printArea method.
    public double printArea(){
       return (radius*radius*Math.PI);
    }
}
public class ShapeClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter the colour : ");
        String colour = sc.next();
        System.out.print("Please enter the radius of circle : ");
        float radius = sc.nextFloat();

        Circle colourArea = new Circle(colour,radius);//Creating object.

        colourArea.printColour(); //Calling method.
        System.out.println("Area of circle : " + colourArea.printArea()); //Calling method.
    }
}
