//15.Create class Point with attributes x and y. Write method distance() to find distance from origin.
import java.util.Scanner;
public class PointClass {
    static class Point{
        float x;
        float y;
        //Distance Method.
        public double distance(){
            return Math.sqrt((x * x) + (y * y));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point point = new Point();//Instantiating new point class.

        //Asking for attributes.
        System.out.print("Enter X axis = ");
        point.x = sc.nextFloat();
        System.out.print("Enter Y axis = ");
        point.y = sc.nextFloat();

        //Calling Method.
        double distanceFromOrigin = point.distance();
        //Distance from Origin.
        System.out.println("Distance of point A from Origin : " + distanceFromOrigin + "Units.");
    }
}
