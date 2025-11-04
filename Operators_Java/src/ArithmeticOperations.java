/* Arithmetic Operations Declare two integers a = 15 and b = 4. Print their:
   - Sum
   - Difference
   - Product
   - Quotient (as int)
   - Remainder */
public class ArithmeticOperations {
    public static void main(String[] args) {

        //Declaring variables.
        System.out.println("Two numbers a = 15 and b = 4.");
        int a = 15;
        int b = 4;

        //Sum.
        int sum = a+b;
        System.out.println("Sum of two numbers is = "+sum);

        //Difference.
        int dif = a-b;
        System.out.println("Difference of two numbers is = " + dif);

        //Product.
        int pro = a*b;
        System.out.println("Product of two numbers is = " + pro);

        //Quotient.
        int quo = a%b;
        System.out.println("Quotient  = " + quo);

        //Remainder.
        int rem = a/b;
        System.out.println("Remainder = "  +rem);
    }
}
