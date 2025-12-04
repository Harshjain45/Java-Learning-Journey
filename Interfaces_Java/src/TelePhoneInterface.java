/*12.Create a class TelePhone with ring() , lift() and disconnect() methods as abstract methods.
Create another class SmartTelephone and demonstrate polymorphism.*/

//abstract Class TelePhone.
abstract class TelePhone{
    // abstract ring() method.
    abstract void ring();
    // abstract lift() method.
    abstract void lift();
    // abstract disconnect method.
    abstract void disconnect();
}

//SmartTelephone class.
class SmartTelephone extends TelePhone{
    //Overriding methods.
    @Override
    void ring() {
        System.out.println("This phone can ring.");
    }
    @Override
    void lift() {
        System.out.println("Lift to turn on the screen.");
    }
    @Override
    void disconnect() {
        System.out.println("Flip to disconnect phone.");
    }
}

public class TelePhoneInterface {
    public static void main(String[] args) {

        TelePhone telePhone = new SmartTelephone(); //Creating an object.

        //Calling method.
        telePhone.ring();
        telePhone.lift();
        telePhone.disconnect();

    }
}
