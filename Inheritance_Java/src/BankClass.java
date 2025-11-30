/*12.Create class Bank with method rateOfInterest().
Create SBI, HDFC classes that override this method.
Call using base-class reference*/
//Base Class.
class SBI{
    //rateOfInterset method.
    public void rateOfInterset(){
        System.out.println("Rate of interset of bank is 10%.");
    }
}
//Derived class.
class HDFC extends SBI{
   //Override rateOfInterset method.
    @Override
    public void rateOfInterset(){
        super.rateOfInterset();
        System.out.println("HDFC bank offers 12% rate of interset.");
    }
}
public class BankClass {
    public static void main(String[] args) {

        HDFC rate = new HDFC(); //Object creation.
        rate.rateOfInterset(); //Calling method.
    }
}
