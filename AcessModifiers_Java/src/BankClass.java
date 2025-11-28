/*14.Create a class Bank with private balance.
Create deposit() and withdraw()
Show updated balance using a public method.*/
public class BankClass {
    //Bank class.
    static class Bank {
        private double balance; // private attribute
        //Constructor.
        Bank(double balance) {
            this.balance = balance;
        }
        //Deposit method.
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount Deposited : " + amount);
        }
        //Withdraw method.
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient Balance!");
            } else {
                balance -= amount;
                System.out.println("Amount Withdrawn : " + amount);
            }
        }
        //Public method to show updated balance.
        public void showBalance() {
            System.out.println("Updated Balance : " + balance);
        }
    }
    public static void main(String[] args) {

        Bank bank = new Bank(5000); //Instantiating new bank class.

        bank.deposit(1500);    //Depositing money.
        bank.withdraw(2000);   //Withdrawing money.
        bank.showBalance();    //Printing updated balance.
    }
}
