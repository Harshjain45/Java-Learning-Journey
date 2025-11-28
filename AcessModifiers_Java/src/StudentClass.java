//1.Create a class Student with attribute's name and age.Use a constructor to initialize them and print details.
public class StudentClass {
     //Student Class.
     static class Student{
        String name;
        int id;
        //Constructor.
         Student(String name , int id){
             this.name = name;
             this.id = id;
         }
         //display Method.
         public void display(){
             System.out.println("Name of the student : " + name);
             System.out.println("Id of the student : " + id);
         }
    }
    public static void main(String[] args) {
         Student student = new Student("Harsh" , 157); //Instantiation of new Student class.
         student.display(); //Calling display method.
    }
}
