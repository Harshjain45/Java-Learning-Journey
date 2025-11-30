/*14.Create base class Shape with method draw().
Override draw() in Circle, Square.
Create:
Shape ref;
ref = new Circle();
ref = new Square();
Show runtime polymorphism.*/
//Base class
class Shape1{
    //draw method.
    public void draw(){
        System.out.println("I can draw a shape.");
    }
}
//Derived circle class.
class Circle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("I can draw circle.");
    }
}
//Derived square class.
class Square1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("I can draw square.");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        //Dynamic method display.
        Shape1 circle = new Circle1(); //Object creation.
        circle.draw(); //Calling method.
        System.out.println(); //Adds a newline.
        Shape1 square = new Square1(); //Object creation.
        square.draw(); //Calling method.
    }
}
