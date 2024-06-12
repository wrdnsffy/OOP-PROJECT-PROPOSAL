//by Wardina Saffiya Binti Jamalulil (24000996) 

public class Transaction {
    private double amount;
    private double balance;
    private String date;

    // Constructor
    public Transaction(double amount, double balance, String date) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
    }

    // Getter for amount
    public double getAmount() {       
        return amount;             
    }
    
    // Setter for amount
    public void setAmount(double amount) {      
        this.amount = amount;         
    }

    // Getter for balance
    public double getBalance() {     
        return balance;              
    }
    
    // Setter for balance
    public void setBalance(double balance) { 
        this.balance = balance; 
    }

    // Getter for date
    public String getDate() {        
        return date;           
    }
    
    // Setter for date
    public void setDate(String date) {  
        this.date = date;       
    }
}

//test code by Wardina Saffiya Binti Jamalulil (24000996) 

public class Main {
    public static void main(String[] args) {
        // Create a new transaction
        Transaction transaction = new Transaction(300.00, 2500.00, "2024-06-22");

        // Print initial transaction details
        System.out.println("Transaction Details:");
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Balance: " + transaction.getBalance());
        System.out.println("Date: " + transaction.getDate());

        // Update transaction details
        transaction.setAmount(200.00);
        transaction.setBalance(1000.50);
        transaction.setDate("2024-06-13");

        // Print updated transaction details
        System.out.println("\nUpdated Transaction Details:");
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Balance: " + transaction.getBalance());
        System.out.println("Date: " + transaction.getDate());
    }
}
