package polimorphismque10;
/* 10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees. */

import inheritanceque3.SavingAccount;

public class SavingsAccount_10 extends BankAccount_10 {
    public void deposit() {
        System.out.println();
    }

    public void withdraw() {
        int amount = 100;
        if (amount >= 10) {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw();
    }
}

