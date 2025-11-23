//6.Create a class Mobile with brand, ram, and storage. Write a method showInfo().
public class MobileClass {
    static class Mobile{
        String brand;
        int ram;
        int storage;
        //showInfo method.
       public void showInfo(){
           System.out.println("Mobile Brand : " + brand);
           System.out.println("mobile Ram : " + ram + "GB");
           System.out.println("Mobile Storage : " + storage + "GB");
       }
    }
    public static void main(String[] args) {
        System.out.println("Custom Mobile Class:");
        Mobile mobile = new Mobile(); //Instantaiting new Mobile class.
        //Setting Attributes.
        mobile.brand = "Realme";
        mobile.ram = 8;
        mobile.storage = 128;
        //Printing mobile info using showInfo method.
        mobile.showInfo();
    }
}
