/*5.Create class Parent with a parameterized constructor (takes name).
Create Child class that calls parent constructor using super().
Print both parent and child details.*/
//Base class
class Parent {
    String name;
    //Parameterized constructor
    Parent(String name) {
        this.name = name;
    }
    //Method to print details
    public void printParent() {
        System.out.println("Parent Name : " + name);
    }
}
//Derived class
class Child extends Parent {
    String childName;
    //Constructor of Child class
    Child(String parentName, String childName) {
        super(parentName);    //Calling Parent constructor
        this.childName = childName;
    }
    //Method to print child details
    public void printChild() {
        printParent();
        System.out.println("Child Name : " + childName);
    }
}

 public class ParameterizedConstructor{
    public static void main(String[] args) {
        Child c = new Child("John", "Cena");  //Object creation
        c.printChild();       //Calling method
    }
}
