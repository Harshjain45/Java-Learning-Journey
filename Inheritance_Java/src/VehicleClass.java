/*2.Create a class Vehicle with company and speed.
Create a Bike class that inherits a Vehicle and prints its details.*/
//Base class.
class Vehicle {
    String company;
    int speed;
    //Constructor.
    Vehicle(String company , int speed){
        this.company = company;
        this.speed = speed;
    }
    //printDetail method.
    public void printDetail(){
        System.out.println("Company Name : " + company);
        System.out.println("Top Speed : " + speed + "Km/hr");
    }
}
//Derived class.
class Bike extends Vehicle {
    float price;
    String model;
    //Constructor for Bike
    Bike(String company, int speed, String model, float price) {
        super(company, speed); // calling Vehicle constructor
        this.model = model;
        this.price = price;
    }
    //printDetail method.
    @Override
    public void printDetail(){
        super.printDetail();//prints company + speed.
        System.out.println("Bike model : " + model);
        System.out.println("Price of bike : " + "Rs" + price);
    }
}
public class VehicleClass {
    public static void main(String[] args) {
      Bike bike = new Bike("Honda" , 180 , "Extreme" , 180000.88f);//Creating an object.
        bike.printDetail();//Calling method.
    }
}
