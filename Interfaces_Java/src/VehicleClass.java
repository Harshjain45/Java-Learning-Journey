/*4.Vehicle Start/Stop
Create abstract class Vehicle with abstract:
start()
stop()
Implement in Car and Bike.
Call using:
Copy code
Vehicle v = new Car();
v.start();
v.stop();.*/

//Vehicle abstract base class.
abstract class Vehicle{
    //abstract methods.
    abstract void start();
    abstract void stop();
}

//Derived bike class.
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike Start.");
    }
    @Override
    public void stop(){
        System.out.println("Bike Stop.");
    }
}
//Derived car class.
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car Start.");
    }
    @Override
    public void stop(){
        System.out.println("Car Stop.");
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Vehicle v = new Car(); //Object creation.
        //Calling methods.
        v.start();
        v.stop();
        System.out.println();
        Vehicle vh = new Bike(); //Object creation.
        //Calling methods.
        vh.start();
        vh.stop();
    }
}
