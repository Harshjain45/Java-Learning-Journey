/*13.Create a class Person with private age and name.
Use setter & getter methods
Print values using getters.*/
public class PersonClass {
    //Person class.
    static class Person{
        private int age;
        private String name;
        //Setter method.
        public void setDetails(String name , int age){
            this.name = name;
            this.age = age;
        }
        //Getter method.
        public void getDetails(){
            System.out.println("Name of person : " + name);
            System.out.println("Age of person : " + age);
        }
    }
    public static void main(String[] args) {
           Person p = new Person(); //Instantiation new person class.
           p.setDetails("Harsh",21); //Setting details.
           p.getDetails();
    }
}
