/*6.Payment Interface
Create interface Payment with method pay().
Implement in:
UPI
Cash
Card
Use interface reference to call pay().*/

//Payment Interface.
interface Payment{
    //Interface methods.
    void pay();
}

//Derived UPI Class.
class UPI implements Payment{
    //implementing interface.
    @Override
    public void pay(){
        System.out.println("You can pay through UPI.");
    }
}

//Derived UPI Class.
class Cash implements Payment{
    //implementing interface.
    @Override
    public void pay(){
        System.out.println("You can pay through Cash.");
    }
}

//Derived UPI Class.
class Card implements Payment{
    //implementing interface.
    @Override
    public void pay(){
        System.out.println("You can pay through Card.");
    }
}

public class PaymentInterface{
    public static void main(String[] args) {

        System.out.println("You can pay through these methods.");

        //Object Creation.
        Payment upi = new UPI();
        Payment cash = new Cash();
        Payment card = new Card();

        //Calling Methods.
        upi.pay();
        cash.pay();
        card.pay();

    }
}
