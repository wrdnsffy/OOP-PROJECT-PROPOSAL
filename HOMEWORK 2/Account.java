//by Lydia Natasha Binti Muharral (24000481) 

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Client client;
    private String accountNumber;
    private double currentBalance;
    private List<Transaction> transactionList;

    public Account(Client client, String accountNumber, double currentBalance) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.transactionList = new ArrayList<>();
    }

    // Getters and setters
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(double currentBalance) { this.currentBalance = currentBalance; }

    public List<Transaction> getTransactionList() { return transactionList; }
    public void setTransactionList(List<Transaction> transactionList) { this.transactionList = transactionList; }

    // Method to add a transaction to the transaction list
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    // Added method to get a transaction at a specific index
    public Transaction getTransaction(int index) {  // <-- Added this method
        if (index >= 0 && index < transactionList.size()) {
            return transactionList.get(index);
        } else {
            System.out.println("Transaction index out of bounds.");
            return null;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.currentBalance += amount;
            addTransaction(new Transaction("deposit", amount));
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.currentBalance) {
            this.currentBalance -= amount;
            addTransaction(new Transaction("withdrawal", amount));
            return true;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
            return false;
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return this.currentBalance;
    }
}

//test code by Wardina Saffiya Binti Jamalulil
public class Main {
    public static void main(String[] args) {
        // Create an address
        Address address = new Address("123 Jalan Mudah", "Bandar Baru", "Ipoh", "35367");

        // Create a client
        Client client = new Client("Nina", "Lily", "ninalily", "12345", "123-456-7890", address);

        // Create an account for the client
        Account account = new Account(client, "1234567890", 500.0);

        // Print initial account details
        System.out.println("Initial Account Details:");
        System.out.println("Client: " + account.getClient());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getCurrentBalance());

        // Deposit money
        account.deposit(200.0);
        System.out.println("\nAfter depositing $200:");
        System.out.println("Current Balance: " + account.getCurrentBalance());

        // Withdraw money
        boolean withdrawalSuccess = account.withdraw(100.0);
        System.out.println("\nAfter withdrawing $100:");
        if (withdrawalSuccess) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        System.out.println("Current Balance: " + account.getCurrentBalance());

        // Attempt to withdraw more money than available balance
        withdrawalSuccess = account.withdraw(1000.0);
        System.out.println("\nAttempt to withdraw $1000:");
        if (withdrawalSuccess) {
            System.out.println("Withdrawal successful.");
        } 
        else {
            System.out.println("Withdrawal failed due to insufficient balance.");
        }
        System.out.println("Current Balance: " + account.getCurrentBalance());

        // Print all transactions
        System.out.println("\nTransaction History:");
        for (Transaction transaction : account.getTransactionList()) {
            System.out.println(transaction);
        }
    }
}
