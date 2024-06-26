//by Nur Aisya' Sofea Binti Husin 22012332

class Account {
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

    // Method to add transaction to the transaction list
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
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
