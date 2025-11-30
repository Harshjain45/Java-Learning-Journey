/*8.Create class Employee with overloaded constructors:
– (name, salary)
– (name)
Create class Manager that extends Employee and adds department.
Create objects using both constructors.
*/
//Base Employee class.
class Employee{
    String name;
    float salary;
    //Constructor-1
    Employee(String name , float salary){
        this.name = name;
        this.salary = salary;
    }
    //Constructor-2
    Employee(String name){
        this.name = name;
        this.salary = 0;  // default value
    }
    public void name(){
        System.out.println("Name of employee : " + name);
    }
    public void salary(){
        System.out.println("Salary : " + salary);
    }
}
//Derived Manager class.
class Manager extends Employee{
    String department;
    //Constructor 1 → uses Employee(name, salary)
    Manager(String name , float salary , String department){
        super(name,salary);
        this.department = department;
    }
    //Constructor 2 → uses Employee(name)
    Manager(String name, String department){
        super(name);
        this.department = department;
    }

    public void details(){
        name();
        salary();
        System.out.println("Department : " + department);
    }
}

public class EmployeeClass {
    public static void main(String[] args) {

        // Using (name, salary) constructor
        Manager m1 = new Manager("Harsh", 4500000f, "IT");
        m1.details();

        System.out.println();

        // Using (name) constructor
        Manager m2 = new Manager("Raj", "HR");
        m2.details();
    }
}

