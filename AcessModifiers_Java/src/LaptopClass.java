/*5.Create a class Laptop with brand and price.
>One default constructor
>One parameterized constructor
>Print which constructor was called
*/
public class LaptopClass {
    //Laptop Class.
    static class MyLaptop{
        String brand;
        float price;
        //default constructor.
        MyLaptop(){
            System.out.println("this is default constructor.");
        }
        //Parameterized constructor.
        MyLaptop(String brand, float price){
            this.brand = brand;
            this.price = price;
            System.out.println("Parameterized Constructor:");
        }
        //display method.
        public void display(){
            System.out.println("Laptop brand : " + brand);
            System.out.println("Laptop price : " + "$"+ price);
        }
    }
    public static void main(String[] args) {
        //Object 1.
       MyLaptop laptop1 = new MyLaptop("Asus",49999.99f);
        laptop1.display();

        //Object 2.
        System.out.println();//Print a newline.
        System.out.println("Default Constructor:");
        MyLaptop laptop2 = new MyLaptop();
    }
}
