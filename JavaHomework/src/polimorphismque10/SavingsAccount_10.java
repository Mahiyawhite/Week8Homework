package polimorphismque10;
/* 10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees. */

public class SavingsAccount_10 extends BankAccount_10 {
    public void deposit() {
        System.out.println();
    }

    public void withdraw() {
        int amount = 100;
        if (amount >= 10) {
            System.out.println("Can not Withdraw");
        }
    }

    public static void main(String[] args) {
        SavingsAccount_10 s = new SavingsAccount_10();
        s.withdraw();
    }
}

