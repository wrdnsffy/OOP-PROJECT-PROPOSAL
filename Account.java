class Account {
    private Client client;
    private String accountNumber;
    private double currentBalance;
    private List<Transaction> transactionList;

    // Dummy methods
    public Account(Client client, String accountNumber, double currentBalance) {
        // Initialize fields
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
        // Add transaction to list
    }
}
