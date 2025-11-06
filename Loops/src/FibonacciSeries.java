import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        //ImportingScanner.
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0;  // first number of series
        int second = 1; // second number of series

        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        // Loop starts from 3rd term
        for (int i = 3; i <= n; i++) {
            int next = first + second; // sum of the previous two
            System.out.print(next + " ");
            first = second;  // move forward
            second = next;
        }
    }
}
