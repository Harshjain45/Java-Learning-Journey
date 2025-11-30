/*7. Create class Box with overloaded constructors:
   – Box(l,b,h)
   – Box(l) for cube
   Create class SmallBox that extends Box and prints volume for both constructors.
*/
import java.util.Scanner;
// Base class
class Box {
    float length;
    float breadth;
    float height;
    // Constructor 1 → cuboid
    Box(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    // Constructor 2 → cube
    Box(float length) {
        this.length = length;
        this.breadth = length;
        this.height = length;
    }
}
// Derived class
class SmallBox extends Box {
    // Constructor for cuboid
    SmallBox(float length, float breadth, float height) {
        super(length, breadth, height);
    }
    // Constructor for cube
    SmallBox(float side) {
        super(side); // calls Box(side)
    }
    // Volume of cuboid
    public float volumeOfCuboid() {
        return length * breadth * height;
    }
    // Volume of cube
    public float volumeOfCube() {
        return length * length * length;
    }
}

public class BoxClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cuboid input
        System.out.print("Enter cuboid length: ");
        float l = sc.nextFloat();
        System.out.print("Enter cuboid breadth: ");
        float b = sc.nextFloat();
        System.out.print("Enter cuboid height: ");
        float h = sc.nextFloat();

        SmallBox cuboid = new SmallBox(l, b, h);
        System.out.println("Volume of Cuboid: " + cuboid.volumeOfCuboid());

        // Cube input
        System.out.print("Enter cube side: ");
        float s = sc.nextFloat();

        SmallBox cube = new SmallBox(s);
        System.out.println("Volume of Cube: " + cube.volumeOfCube());

        sc.close();//Closing Scanner.
    }
}
