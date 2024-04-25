package polimorphismque10;
/* 10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees. */

public class CheckingAccount_10 extends BankAccount_10 {
    public void deposit(){
        System.out.println();
    }
    public void withdraw() {
        int amount = 100;
        if (amount >= 100) {
            System.out.println("Withdraw: £" + amount);
        }
    }

    public static void main(String[] args) {
        CheckingAccount_10 ch = new CheckingAccount_10();
        ch.deposit();
        ch.withdraw();
    }
}
