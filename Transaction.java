//by Wan Nur Irdina Binti Wan Hasbullah 24000247

class Transaction {
    private double amount;
    private double balance;
    private String date;
    
    public Transaction(double amount, double balance, String date) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;      
    }

    public double getAmount() {       
        return amount;             
    }
    
    public void setAmount(double amount) {      
        this.amount = amount;         
    }

    public double getBalance() {     
        return balance;              
    }
    
    public void setBalance(double balance) { 
        this.balance = balance; 
    }

    public String getDate() {        
        return date;           
    }
    
    public void setDate(String date) {  
        this.date = date;       
    }
}
