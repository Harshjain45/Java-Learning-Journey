/*15.Create class Animal.
Override eat() in Dog and Cat.
Create:
Animal a;
a = new Dog();
a.eat();
a = new Cat();
a.eat();
Demonstrate DMD.*/
//Base class.
class Animal1{
    //eat method.
    public void eat(){
        System.out.println("Animal Eat : Animal food.");
    }
}
//Derived dog class.
class Dog1 extends Animal1{
    //override method.
    public void eat(){
        System.out.println("Dog eats : Dog food.");
    }
}
//Derived cat class.
class Cat1 extends Animal1{
    //override method.
    public void eat(){
        System.out.println("Cat eats : Cat food.");
    }
}
public class AnimalClass1 {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1(); //Object creation.
        animal1.eat(); //Calling method.
        System.out.println(); //Adds a new line.
        Animal1 animal2 = new Cat1(); //Object creation.
        animal2.eat(); //Calling method.
    }
}
