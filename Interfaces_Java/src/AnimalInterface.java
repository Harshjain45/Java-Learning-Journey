/*7️.Animal Interface
Create interface Animal with method eat().
Implement in Tiger and Cow.
Call them polymorphically.*/

//Animal1 interface.
interface Animal1{
      //eat method.
      void eat();
}
//Derived class Tiger.
class Tiger implements Animal1{
    @Override
    public void eat(){
        System.out.println("Tiger eats : Meat.");
    }
}
//Derived class Cow.
class Cow implements Animal1{
    @Override
    public void eat(){
        System.out.println("Cow eats : Grass.");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {

        System.out.println("Animal eats these things.");

        Animal1 tiger = new Tiger();  //Object creation.
        tiger.eat(); //Method Calling.

        Animal1 cow = new Cow();  //Object creation.
        cow.eat(); //Method Calling.

    }
}
