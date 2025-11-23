//7.Create a class Employee with attribute's name and salary. Write a method annualSalary().
public class EmployeeClass {
    //Employee Class.
    String name;
    double salary;
    //annualSalary.
    public double annualSalary(){
        return salary;
    }

    public static void main(String[] args) {
        System.out.println("Employee Custom Class:");
        EmployeeClass employee = new EmployeeClass(); //Instantaiting new Employee Class.
        //Setting Attributes.
        employee.name = "Harsh";
        employee.salary = 45;
        //Printing Employee details.
        System.out.println("Name of Employee : " + employee.name);
        double salary = employee.annualSalary(); //Calling method.
        System.out.println("Salary of Employee : " + salary);
    }
}
