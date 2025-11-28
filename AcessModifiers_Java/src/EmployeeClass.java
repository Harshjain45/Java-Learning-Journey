/*6.Create a class Employee with name, salary, and department.
Write a constructor to initialize all attributes and add annualSalary()
*/
public class EmployeeClass {
    //Employee class.
    static class MyEmployee{
        String name;
        double salary;
        String department;
        //Constructor.
        MyEmployee(String name,double salary,String department){
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        //display method.
        public void display(){
            System.out.println("Name of Employee : " + name);
            System.out.println("Salary of Employee : " + salary);
            System.out.println("Department of Employee : " + department);
        }
        //annual salary method.
        public double annualSalary(){
            return 12*salary;
        }
    }
    public static void main(String[] args) {
      MyEmployee employee = new MyEmployee("Harsh",100000f,"IT"); //Instantiation of new employee class
        //Displaying the detail.
    employee.display();
    //Calling the method.
    double annualSalary = employee.annualSalary();
        System.out.println("Annual Salary = " + annualSalary);//Printing annual Salary
    }
}