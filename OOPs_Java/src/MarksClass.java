//11 Create a class Marks with 3 subject marks. Write total() and percentage() methods.
import java.util.Scanner;
public class MarksClass {
    //Marks Class.
    static class Marks{
        float sub1;
        float sub2;
        float sub3;
        //Total method.
        public float total(){
            return sub1 + sub2 + sub3;
        }
        //Percentage method.
        public float percentage(){
            return ( total() * 100 ) / 300;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Marks Custom Class");

        Marks marks = new Marks(); //Instantiating new marks class.

        //Asking for attributes.
        System.out.println("Please enter marks of 3 subjects out of 100.");
        System.out.print("Enter marks of Subject 1 : ");
        marks.sub1 = sc.nextFloat();
        System.out.print("Enter marks of Subject 2 : ");
        marks.sub2 = sc.nextFloat();
        System.out.print("Enter marks of Subject 3 : ");
        marks.sub3 = sc.nextFloat();

        //Calling total method.
        float total = marks.total();
        System.out.println("Total Marks Obtained : " + total);

        //Calling percentage method.
        float percentage = marks.percentage();
        System.out.println("Total Percentage Obtained : " + percentage + "%");
        sc.close();//Closing Scanner.
    }
}
