//by Muhammad Aiman Haikal bin Mohammad Akmal Surish (24000458) 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Accounts {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int id) {
        accounts.removeIf(account -> account.getId() == id);
    }

    public void printAllAccounts() {
        accounts.forEach(System.out::println);
    }

    public Account findAccountById(int id) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getId() == id)
                .findFirst();
        return account.orElse(null);
    }
}

//test code by Wardina Saffiya Binti Jamalulil (24000996)

public class Main {
    public static void main(String[] args) {
        // Create an instance of AccountManager
        AccountManager accountManager = new AccountManager();

        // Add accounts
        accountManager.addAccount(new Accounts(1, "Nina", 1000.0));
        accountManager.addAccount(new Accounts(2, "Amanda", 1500.0));
        accountManager.addAccount(new Accounts(3, "Lily", 2000.0));

        // Print all accounts
        System.out.println("All Accounts:");
        accountManager.printAllAccounts();

        // Find and print an account by ID
        System.out.println("\nFind Account with ID 2:");
        Accounts account = accountManager.findAccountById(2);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }

        // Remove an account by ID
        accountManager.removeAccount(2);
        System.out.println("\nAll Accounts after removing account with ID 2:");
        accountManager.printAllAccounts();
    }
}
