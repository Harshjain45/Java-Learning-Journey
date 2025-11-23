//3.Create a class Person with attribute's name and city. Write a method introduce() that prints a short introduction.
public class PersonClass {
//Person class.
static class Person{
        String name;
        String city;
        //Introduction method.
        public void introduce(){
            System.out.println("Hey , I am " + name + " From " + city + ".");
        }
    }

    public static void main(String[] args) {

        System.out.println("Person Custom Class:");

        Person harsh = new Person();  //Instantiating new person class.

        //Setting Attributes.
        harsh.name = "Harsh";
        harsh.city = "Bhopal";

        //Calling introduction method.
        harsh.introduce();
    }
}
