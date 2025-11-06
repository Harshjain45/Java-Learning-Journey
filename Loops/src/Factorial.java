//Factorial of a number Input: n = 5 -> Output: 120.
public class Factorial {
    public static void main(String[] args) {
        //Initializing an integer.
        int n = 5;

        //Variable for storing multiplication.
        int mul = 1;

        //Applying for loop to get factorial.
        for (int num  = 1; num<=n; num++ )
            {  mul = mul * num;}
        System.out.println("Factorial of " + n + " is equal to : " + mul);
    }
}
