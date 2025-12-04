/*14.Static Methods in Interface
Create interface MathUtility with static methods:
square(int)
cube(int)
*/

//MathUtility Interface.
interface MathUtility {

    //Static square method.
    static int square(int x) {
        return x * x;
    }

    //Static cube method.
    static int cube(int x) {
        return x * x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        //Calling static methods directly using interface name.
        System.out.println("Square of 5 : " + MathUtility.square(5));
        System.out.println("Cube of 3 : " + MathUtility.cube(3));
    }
}

