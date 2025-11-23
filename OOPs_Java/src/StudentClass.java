//1.Create a class Student with attributes' name and age. Create an object and print values.
// Student class.
class Student{
    String name;
    float age;
}
public class StudentClass {
    public static void main(String[] args) {

        Student harsh = new Student(); //Instantiating new student class.

        //Setting attributes.
        harsh.name = "Harsh";
        harsh.age = 20;

        //Printing the attributes.
        System.out.println("Name : " + harsh.name);
        System.out.println("Age : " + harsh.age);
    }
}
