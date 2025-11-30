/*11.Create class Car with method display().
Create SportCar that overrides display() and uses super to print base details plus
its own details.*/
//Base class.
class Car{
    //display method.
    public void display(){
        System.out.println("This is car class.");
    }
}
//Derived class.
class SportCar extends Car{
    //Override method.
    public void display(){
        super.display();
        System.out.println("This is Sports Car class.");
    }
}
public class CarClass {
    public static void main(String[] args) {

        SportCar car = new SportCar(); //Object creation.
        car.display();
    }
}
