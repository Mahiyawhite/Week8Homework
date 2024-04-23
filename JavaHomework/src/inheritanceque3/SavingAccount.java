package inheritanceque3;
/* Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred. */

public class SavingAccount extends BankAccount {
    public void deposit() {
        super.deposit();
    }
    @Override
    public void withdraw() {
        int amount = 100;
        if (amount >= 100) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw();
        s.deposit();
    }
}
