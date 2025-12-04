/*3.Employee Bonus System
Create abstract class Employee with:
name, salary
abstract calculateBonus()
Create Developer and Manager with different bonus logic.*/

//Abstract Employee Base Class.
abstract class Employee{
     String name;
     double salary;
     //Constructor.
    Employee(String name , double salary){
        this.name = name;
        this.salary = salary;
    }
     //Abstract method.
     abstract double calculateBonus();
}

//Derived Developer class.
class Developer extends Employee{
    //Constructor.
     Developer(String name , Double salary){
         super(name,salary);
     }
     //Overriding method.
    @Override
    public double calculateBonus(){
         return salary * 0.10;
    }
}

//Derived Manager class.
class Manager extends Employee{
    //Constructor.
    Manager(String name , Double salary){
        super(name,salary);
    }
    //Overriding method.
    @Override
    public double calculateBonus(){
        return salary * 0.12;
    }
}

public class EmployeeClass {
    public static void main(String[] args) {

        Developer developer = new Developer("Harsh" , 4500000d); //Object creation.
        //Calling methods.
        System.out.println("Name of Employee : " + developer.name);
        System.out.println("Salary of Employee : " + developer.salary);
        System.out.println("This year bonus : " + developer.calculateBonus());

        Manager manager = new Manager("Aditi" , 5000000d); //Object creation.
        //Calling methods.
        System.out.println("Name of Employee : " + manager.name);
        System.out.println("Salary of Employee : " + manager.salary);
        System.out.println("This year bonus : " + manager.calculateBonus());
    }
}
