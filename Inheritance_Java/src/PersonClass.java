/*3.Create a class Person with name.
Create a class Student that extends Person and adds roll number.
Print name and roll number.*/
//Base class.
class Person{
    String name;
    //Constructor.
    Person(String name){
        this.name = name;
    }
    //printDetail method.
    public void printDetail(){
        System.out.println("Name of student : " + name);
    }
}
//Derived class.
class Student extends Person{
    int rollNo;
    //Constructor.
    Student(String name , int rollNo){
        super(name);
        this.rollNo = rollNo;
    }
    //printDetail method.
    @Override
    public void printDetail(){
        super.printDetail();
        System.out.println("Roll Number of student : " + rollNo);
    }
}
public class PersonClass {
    public static void main(String[] args) {
        Student student = new Student("Harsh" , 157); //Creating an object.
        student.printDetail(); //Calling printDetail method.
    }
}
