/*9.Create class Laptop with variables brand, price.
Use this keyword to differentiate between local and instance variables in constructor.*/
//Laptop class.
class Laptop{
    String brand; //Instance variable stored in heap memory.
    float price; //Instance variable stored in heap memory.
    //Constructor.
    Laptop(String brand , float price){
            this.brand = brand;  //Local variable stored in stack memory.
            this.price = price; //Local variable stored in stack memory.
    }
    //printDetails method.
    public void printDetails(){
        System.out.println("Laptop Brand : " + brand);
        System.out.println("Laptop Price : " + "Rs." + price);
    }
}

public class LaptopClass {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Asus" , 49999.99f); //Object creation.
        laptop.printDetails(); //Calling Method.
    }
}
