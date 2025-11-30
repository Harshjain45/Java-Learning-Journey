//1.Create a class animal and derive another class cat from it.
class Animal{
    //Base class
    public void sound(){
        System.out.println("Animal makes sound.");
    }
}
//Derived class.
class Cat extends Animal{
    public void catSound(){
        System.out.println("Cat sound : meow");

    }
}
public class AnimalClass {
    public static void main(String[] args) {
        Cat sounds = new Cat();//object creation.
        sounds.sound();//calling method from base class.
        sounds.catSound();//calling method from derived class.
    }
}
