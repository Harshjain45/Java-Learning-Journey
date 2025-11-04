/* Assignment Operators Declare int a = 10.
   Use +=, -=, *= and /= with another int b = 2.Print values after each operation. */
public class AssignmentOperators {
    public static void main(String[] args) {

        //Declaring integer.
        System.out.println("Integer a = 10.");
        int a = 10;

        //using +=
        a += 2;
        System.out.println("After a+= , a = " + a);

        //using -=
        a -= 2;
        System.out.println("After a-= , a = " + a);

        //using *=
        a *= 2;
        System.out.println("After a*= , a = " + a);

        //using /=
        a /= 2;
        System.out.println("After a/= , a = " + a);
    }
}
