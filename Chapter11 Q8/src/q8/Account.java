/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private ArrayList<Transaction> transactions;

    // Constructor with parameters for name, id, and balance
    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        transactions.add(new Transaction("Deposit", amount));
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        }
        transactions.add(new Transaction("Withdrawal", -amount));
        balance -= amount;
        return true;
    }

    // Getters for name, id, and balance
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    // Method to print an account summary
    public void printSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: $" + balance);

        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            Date date = new Date(transaction.getDate().parse(transaction.getDate())); // Parse the string to a Date
            String type = transaction.getType();
            double amount = transaction.getAmount();

            System.out.printf("%s on %tF at %1$tT: $%.2f%n", type, date, amount);
        }
    }

    // Inner class for Transaction
    private static class Transaction {
        private String type;
        private double amount;
        private String date;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
            this.date = date;
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public String getDate() {
            return date;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);
        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);

        account.printSummary();
    }
}