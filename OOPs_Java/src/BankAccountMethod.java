//9.Create a class BankAccount with attribute's name and balance.Write deposit() and withdraw() methods.
import java.util.Scanner;
public class BankAccountMethod {
//BankAccount class.
    static class BankAccount {
        String name;
        double balance;

        // Deposit method
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(); //Instantiation new Bank Account class.

        //Setting Attributes.
        account.name = "Harsh";
        account.balance = 45000;

        //Printing Attributes.
        System.out.println("Account Holder : " + account.name);
        System.out.println("Current Balance : " + account.balance);

        //User Input.
        System.out.print("Enter 1 to Deposit, 2 to Withdraw: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        }
        else if (choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        }
        else {
            System.out.println("Invalid option!");
        }

        // Final balance:
        System.out.println("Updated Balance: " + account.balance);
        sc.close(); //Closing Scanner.
    }
}
