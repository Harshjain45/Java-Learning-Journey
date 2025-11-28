/*9.Create a class Mobile with brand, ram, and storage.
Use a constructor that takes all three values
Add showSpecs()*/
public class MobileClass {
    //Mobile class.
    static class Mobile{
        String brand;
        int ram;
        int storage;
        //constructor class.
        Mobile(String brand,int ram,int storage){
            this.brand = brand;
            this.ram = ram;
            this.storage = storage;
        }
        //showSpecs Method.
        public void showSpecs(){
            System.out.println("Mobile Brand : " + brand);
            System.out.println("Mobile Ram : " + ram + "GB");
            System.out.println("Mobile Storage : " + storage + "GB");
        }
    }
    public static void main(String[] args) {

        Mobile mobile = new Mobile("RealMe",8,128);//Instantiation of new mobile class.
        mobile.showSpecs();//method called.
    }
}
