/* Type conversion practice declares a double variable with value 7.9.
   Assign it to an int variable (using type casting) and print both.
   Observe and understand the results. */
public class TypeCasting {
    public static void main(String[] args) {
        //Value in double data type.
        double d = 7.9;

        //Casting it into integer.
        int i = (int)d;

        //Printing Value Before Casting.
        System.out.println("Double value = "+d);

        //Printing Value After Casting.
        System.out.println("After Type Casting to int = "+i);
    }
}
