package inheritanceque3;
/* Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred. */

public class BankAccount {
    public void deposit(){
        System.out.println();
    }
    public void withdraw(){
        int amount = 100;
        System.out.println("Withdrawn: $" + amount);
    }

}
