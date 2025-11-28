/*7.Create a class Point with x and y coordinates.
Write a constructor
Write a method distanceFromOrigin()
*/
import java.util.Scanner;
public class PointClass {
    //Point Class.
    static class Point{
        float x;
        float y;
        //Constructor.
        Point(float x,float y){
           this.x = x;
           this.y = y;
        }
        //distanceFromOrigin method.
        public double distanceFromOrigin(){
         return Math.sqrt((x*x) + (y*y));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.println("Enter the coordinates of point A : ");
        System.out.print("Enter X axis : ");
        float x = sc.nextFloat();
        System.out.print("Enter Y axis : ");
        float y = sc.nextFloat();

        Point distanceOfTwoPoint = new Point(x,y);//Instantiation of new point class.
        double distanceFromOrigin = distanceOfTwoPoint.distanceFromOrigin();//Calling Method.
        //Printing the distance of point A from origin.
        System.out.println("Distance from origin : " + distanceFromOrigin);
        sc.close();//Closing scanner.
    }
}
