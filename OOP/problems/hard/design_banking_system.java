// Problem: Design Banking System using Abstraction and Polymorphism
// Concept: Abstract Class with Runtime Polymorphism
// Time Complexity: O(1)
// Space Complexity: O(1)

abstract class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.05;

        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.02;

        System.out.println("Current Interest: " + interest);
    }
}

public class Solution {

    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(10000);
        BankAccount acc2 = new CurrentAccount(10000);

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}