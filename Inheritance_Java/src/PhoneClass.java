/*13.Create a base class Phone with method features().
Override in SmartPhone.
Call methods using:
Phone obj = new SmartPhone();
(Show dynamic method dispatch).*/
//Base class.
class Phone{
    //features method.
    public void features(){
        System.out.println("Basic Phone feature.");
    }
}
//Derived class.
class SmartPhone extends Phone{
    //Override method.
    @Override
    public void features(){
        System.out.println("Smart Phone Feature : Touch screen , Finger Print senser , Camera.");
    }
}
public class PhoneClass {
    public static void main(String[] args) {
        //DMD dynamic method dispatch.
        Phone obj = new SmartPhone(); //Object creation.
        obj.features(); //Calling method.
    }
}
