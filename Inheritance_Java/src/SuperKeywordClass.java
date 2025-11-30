/*10.Create class Parent with method show().
Create Child class that overrides show() and calls parent show() using super.show().*/
//Base class.
class Parent1{
    //Show details.
    public void showDetails(){
        System.out.println("I am parent class.");
    }
}
//Derived class.
class Child1 extends Parent1{
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("I am child class.");
    }
}
public class SuperKeywordClass {
    public static void main(String[] args) {

        Child1 overRide = new Child1(); //Object creation.
        overRide.showDetails(); //Calling method.
    }
}
