/*5.Bird Fly Behavior
Create abstract class Bird with abstract method fly().
Sparrow flies normally.
Penguin cannot fly to print the appropriate message.*/

//Abstract Bird Base Class.
abstract class Bird {
    //abstract method.
    abstract void fly();
}

//Derived Sparrow Class.
class Sparrow extends Bird{
    //Overriding Method.
    @Override
    public void fly(){
        System.out.println("Sparrow flies normally.");
    }
}
//Derived Penguin Class.
class Penguin extends Bird{
    //Overriding Method.
    @Override
    public void fly(){
        System.out.println("Penguin cannot fly.");
    }
}

public class BirdFlyBehavior {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow(); //Object Creation.
        sparrow.fly(); //Calling Method.
        Penguin penguin = new Penguin(); //Object Creation.
        penguin.fly(); //Calling Method.

        }
}
