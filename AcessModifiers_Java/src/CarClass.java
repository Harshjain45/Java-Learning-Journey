//2.Create a class Car with brand and model. Use a parameterized constructor to assign values and display info.
import java.util.Scanner;
public class CarClass {
    //Car Class.
    static class MyCar{
        String brand;
        String model;
        //Constructor.
        MyCar(String brand , String model){
            this.brand = brand;
            this.model = model;
        }
        //Display method.
        public void display(){
            System.out.println("Car Brand : " + brand);
            System.out.println("Car Model : " + model);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter the Brand of car : ");
        String brandOfCar = sc.next();
        System.out.print("Please enter the Model of car : ");
        String modelOfCar = sc.next();

        //Instantiation of new MyCar class.
        MyCar car = new MyCar(brandOfCar , modelOfCar);
        car.display();
        sc.close();//Closing the scanner.
    }
}
