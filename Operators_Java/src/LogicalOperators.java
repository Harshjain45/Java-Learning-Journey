/* Logical Operators Declare boolean a = true, b = false. Print the result of:
   - a && b
   - a || b
   - !a */
public class LogicalOperators {
    public static void main(String[] args) {

        //Declaring integers.
        System.out.println("a = true , b = false.");
        boolean a = true;
        boolean b = false;

        //First case applying AND operation.
        boolean case1 = a && b;
        System.out.println("First Case a && b = " + case1);

        //Second case applying OR operation.
        boolean case2 = a || b;
        System.out.println("Second Case a || b = " + case2);

        //Second case applying OR operation.
        boolean case3 = !a;
        System.out.println("Third Case !a = " + case3);
    }
}
