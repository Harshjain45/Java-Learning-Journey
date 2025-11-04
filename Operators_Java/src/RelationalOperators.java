/* Relational Operators Declare int a = 10, b = 20. Print the result of:
   - a > b
   - a < b
   - a == b
   - a != b */
public class RelationalOperators {
    public static void main(String[] args) {

        //Declaring integers.
        int a = 10;
        int b = 20;
        System.out.println("Integer A = 10 , Integer B = 20.");

        // First Case (a>b).
        boolean case1 = a > b;
        System.out.println("a > b : " + case1);

        // Second Case (a<b).
        boolean case2  = a < b;
        System.out.println("a < b : " + case2);


        // Third Case (a==b).
        boolean case3 = a==b;
        System.out.println("a == b : "+ case3);

        // Fourth Case (a!=b).
        boolean case4 = a != b;
        System.out.println("a != b : "+case4);
    }
}
