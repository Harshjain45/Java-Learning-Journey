/*8.Interface Inheritance
Create interface A with method show().
Create interface B extends A with method display().
Class Demo implements both methods*/

//Interface A.
interface A{
    //show method.
    void show();
}

//Interface B.
interface B extends A{
       //display method.
       void display();
}

//Demo class.
class Demo implements A , B{
    @Override
   public void show() {
        System.out.println("I am a method of interface A.");
    }
    @Override
    public void display() {
        System.out.println("I am method of interface B that extends interface A.");
    }
}

public class InheritanceInterface {
    public static void main(String[] args) {

        Demo demo = new Demo(); //Object Creation.

        demo.show(); //Calling method.
        demo.display(); //Calling method.

    }
}
