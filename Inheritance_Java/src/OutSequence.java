/*4.Create class A with a constructor printing a message.
Create class B that extends A and has its own constructor.
Observe the output sequence.*/
//Base class.
class A{
    //Constructor.
    A(){
        System.out.println("I am constructor of base class");
    }
}
class B extends A{
    //Constructor.
    B(){
      super();
        System.out.println("I am constructor of derived class");
    }
}
public class OutSequence {
    public static void main(String[] args) {
       B b = new B();
    }
}
