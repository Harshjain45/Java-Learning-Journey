/*2.Animal (Abstract + Concrete Method)
Create abstract class Animal with:
abstract sound()
concrete sleep().
Create Dog and Cat.
Call both methods.*/

//Abstract Animal Base Class.
abstract class Animal{
    //Abstract method.
    abstract void sound();
    //Concrete method.
    public void sleep(){
        System.out.println("Animal Takes Sleep.");
    }
}
//Derived Dog class.
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Sound : Bark.");
    }
    public void sleep(){
        super.sleep();
        System.out.println("Dog sleeps for : 5 hours");
    }
}
//Derived Cat class.
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat Sound : Meow-Meow.");
    }
    public void sleep(){
        super.sleep();
        System.out.println("Cat sleeps for : 7 hours");
    }
}
public class AnimalClass {
    public static void main(String[] args) {

        Dog dog = new Dog(); //Object creation.
        //Calling method.
        dog.sleep();
        dog.sound();
        System.out.println();
        Cat cat = new Cat(); //Object creation.
        //Calling method.
        cat.sleep();
        cat.sound();
    }
}
