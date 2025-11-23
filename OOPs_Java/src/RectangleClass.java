//5.Create a class Rectangle with attributes length and breadth. Write a method area() to return the area.
import java.util.Scanner;
public class RectangleClass {
    //Rectangle Class.
    static class Rectangle{
        float length;
        float breadth ;
        //Area method.
        public float Area(){
           return length*breadth;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangle Class:");
        Rectangle rectangle = new Rectangle(); //Instantiating new Rectangle class.
        //Asking for Attributes.
        System.out.print("Enter the Length of Rectangle : ");
        rectangle.length = sc.nextFloat();
        System.out.print("Enter the Breadth of Rectangle : ");
        rectangle.breadth = sc.nextFloat();
        //Calling method.
        float area = rectangle.Area();
        //Printing area of Rectangle.
        System.out.println("Area of Rectangle : " + area);
        sc.close();
    }
}
