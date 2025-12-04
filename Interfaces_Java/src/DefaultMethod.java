/*13.Default Method Override
Create interface Transport with:
abstract move()
default fuelType() (print “Uses petrol”)
Car → use default.*/

// Transport interface
interface Transport {
    // Abstract method
    void move();

    // Default method
    default void fuelType() {
        System.out.println("Uses petrol");
    }
}

// Car class → uses default method
class Car2 implements Transport {
    @Override
    public void move() {
        System.out.println("Car is moving on road.");
    }
}

// ElectricScooter class → overrides default method
class ElectricScooter implements Transport {
    @Override
    public void move() {
        System.out.println("Electric scooter is moving silently.");
    }

    @Override
    public void fuelType() {
        System.out.println("Runs on battery");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {

        Transport t1 = new Car2(); // Car object
        t1.move();
        t1.fuelType(); // Uses default

        System.out.println();

        Transport t2 = new ElectricScooter(); // Scooter object
        t2.move();
        t2.fuelType(); // Overridden method
    }
}
