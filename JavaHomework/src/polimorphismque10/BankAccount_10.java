package polimorphismque10;
/* 10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees. */

public class BankAccount_10 {
    public void deposit(){
        System.out.println();
    }
    public void withdraw(){
        int amount = 1000;
        System.out.println("Can Withdraw any amount");
    }
}
