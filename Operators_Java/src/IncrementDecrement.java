/* Declare an integer x = 5. Print the value after applying:
   - Pre-increment
   - Post-increment
   - Pre-decrement
   - Post-decrement */
import static java.lang.System.*;
public class IncrementDecrement {
    public static void main(String[] args) {

        //Declaring integer.
        out.println("Integer x = 5.");
        int x = 5;

        //Pre-increment.
        out.println("Pre-increment  = " + (++x));

        //Post-increment.
        out.println("Post-increment = " + (x++));

        //Pre-decrement.
        out.println("Pre-decrement  = " + (--x));

        //Post-decrement.
        out.println("Post-decrement = " + (x--));
    }
}
