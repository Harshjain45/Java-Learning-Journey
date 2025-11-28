/*8. Create a class BankAccount with name and balance.
   Constructor to set name and starting balance
   Methods deposit() and withdraw()
*/
import java.util.Scanner;
public class BankAccountClass {
    // BankAccount Class
    static class BankAccount {
        String name;
        double balance;
        // Constructor
        BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }
        // Deposit method
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        }
        // Withdraw method
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient Balance!");
            } else {
                balance -= amount;
                System.out.println("Amount Withdrawn: " + amount);
            }
        }
        // Display current balance
        public void showBalance() {
            System.out.println("Updated Balance: " + balance);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter the name of Bank Owner: ");
        String name = sc.next();

        System.out.print("Enter the starting Bank Balance: ");
        double balance = sc.nextDouble();

        // Object creation
        BankAccount bankAccount = new BankAccount(name, balance);

        // Menu
        System.out.println("Enter 1 to Deposit Money, Enter 2 to Withdraw Money:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            bankAccount.deposit(amount);
        }
        else if (choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            bankAccount.withdraw(amount);
        }
        else {
            System.out.println("Invalid Choice!");
        }
        // Show final balance
        bankAccount.showBalance();
        sc.close();//Closing Scanner.
    }
}

