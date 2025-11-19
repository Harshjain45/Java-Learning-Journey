//11.Write a method table(int n) that prints the multiplication table of n.
import java.util.Scanner;
public class TablePrinterMethod {

    static void table(int n){
        int mul = 1;
        for (int i = 1; i <= 10; i++){
            mul = i * n;
            System.out.println(n + " x " + i +" : "+ mul);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Enter an number(Integer) : ");
        int number = sc.nextInt();

        //Calling method.
        System.out.println("Multiplication table of " + number + " is : ");
        table(number);
        sc.close();
    }
}
