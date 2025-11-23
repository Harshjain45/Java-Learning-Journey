//10.Create a class Calculator with methods add, subtract, multiply, and divide. Create an object and test all methods.
import java.util.Scanner;
public class CalculatorClass {
     //Calculator class.
    static class Calculator {
        double num1;
        double num2;

        //Addition method.
        public double addition() {
            return num1 + num2;
        }

        //Subtraction method.
        public double subtraction() {
            return num1 - num2;
        }

        //Multiplication method.
        public double multiplication() {
            return num1 * num2;
        }

        //Division method.
        public double divide() {
            if (num2 == 0) {
                System.out.println("Invalid Entry:");
                return 0;
            }
            return num1 / num2;
        }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Calculator : ");

            Calculator calculator = new Calculator(); //Instantiation new calculator.

            //Asking for Attributes.
            System.out.print("Enter Number 1 : "); //Number 1.
            calculator.num1 = sc.nextDouble();
            System.out.print("Enter Number 2 : "); //Number 2.
            calculator.num2 = sc.nextDouble();

            //Asking for operation.
            System.out.print("Please enter operation (+,-,*,/) : ");
            char operator = sc.next().charAt(0);
            //Setting condition.
            if (operator == '+') {
                System.out.println("Addition of " + calculator.num1 + " and " + calculator.num2 + " is : " + calculator.addition());
            } else if (operator == '-') {
                System.out.println("Subtraction of " + calculator.num1 + " and " + calculator.num2 + " is : " + calculator.subtraction());
            } else if (operator == '*') {
                System.out.println("Multiplication of " + calculator.num1 + " and " + calculator.num2 + " is : " + calculator.multiplication());
            } else if (operator == '/') {
                System.out.println("Division of " + calculator.num1 + " by " + calculator.num2 + " is : " + calculator.divide());
            } else {
                System.out.println("Invalid Entry");
            }
            sc.close();//Closing Scanner.
        }
    }
