/*10.Calculator Interface
Create interface Calculator with:
add()
subtract()
Implement in BasicCalculator.
Use interface reference to call methods.*/
import java.util.Scanner;
//interface Calculator.
interface Calculator{

    //methods.
    float add();
    float subtract();
}

//BasicCalculator interface implements Calculator.
class BasicCalculator implements Calculator{

    //Attributes.
    float x;
    float y;

    //Constructor.
    BasicCalculator(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Overriding methods.
    @Override
    public float add() {
        return x+y;
    }
    @Override
    public float subtract() {
        return x-y;
    }
}

public class CalculatorInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Enter Number 1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Number 2 : ");
        float num2 = sc.nextFloat();

        Calculator bs = new BasicCalculator(num1,num2); //Object Creation.

        System.out.println("Addition Of Number 1 and Number 2 : " + bs.add()); //Printing Addition.
        System.out.println("Subtraction Of Number 1 and Number 2 : " + bs.subtract()); //Printing Subtraction.

        sc.close(); //Closing Scanner.
    }
}
