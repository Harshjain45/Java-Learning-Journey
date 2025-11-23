//2.Create a class Car with attribute's brand, model, and price. Create 2 objects and print details.
public class CarClass {
    //Car class.
    static class Car{
        String brand;
        String model;
        double price;
    }

    public static void main(String[] args) {
        System.out.println("Custom Car Class");

        //First Object.
        Car car1 = new Car();
        //Setting Attributes.
        car1.brand = "Honda";
        car1.model = "Civic";
        car1.price = 1600000;
        //Printing Attributes.
        System.out.println("\n Printing First Car Details : ");
        System.out.println("Car Brand : " + car1.brand);
        System.out.println("Car Model : " + car1.model);
        System.out.println("Car Price : " + car1.price);

        //Second Object.
        Car car2 = new Car();
        //Setting Attributes.
        car2.brand = "Toyota";
        car2.model = "Fortuner";
        car2.price = 5000000;
        //Printing Attributes.
        System.out.println("\n Printing Second Car Details : ");
        System.out.println("Car Brand : " + car2.brand);
        System.out.println("Car Model : " + car2.model);
        System.out.println("Car Price : " + car2.price);
    }
    }

