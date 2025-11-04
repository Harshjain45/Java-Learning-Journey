/* Compound Assignment Example Declare int x = 8. Perform x += 4,
   then x *= 2, and finally x -= 5. Print the final value of x. */
public class CompoundAssignment {
    public static void main(String[] args) {

        //Declaring integer.
        int x = 8;
        System.out.println("Integer x = " + x);

        //using x += 4.
        x += 4;
        System.out.println("After using x += 4 : " + x);

        //using x *= 2.
        x *= 2;
        System.out.println("After using x *= 2 : " + x);

        //using x -= 4.
        x -= 5;
        System.out.println("After using x -= 5 : " + x);
    }
}
