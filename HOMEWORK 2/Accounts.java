//by Muhammad Aiman Haikal bin Mohammad Akmal Surish (24000458) 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Accounts {
    public class Account {
        private int id;
        private String name;
        private double balance;

        private Account(int id, String name, double balance) {
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

    private List<Account> accounts;

    public Accounts() {
        accounts = new ArrayList<>();
    }

    public Account addAccount(int id, String name, double balance) {
        Account account = new Account(id, name, balance);
        accounts.add(account);
        return account;
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
        // Creating an instance of Accounts
        Accounts accounts = new Accounts();

        // Adding accounts
        accounts.addAccount(1, "Nina", 1000.0);
        accounts.addAccount(2, "Amanda", 1500.0);
        accounts.addAccount(3, "Lily", 2000.0);

        // Printing all accounts
        System.out.println("All Accounts:");
        accounts.printAllAccounts();

        // Finding an account by ID
        int accountIdToFind = 2;
        System.out.println("\nFinding Account with ID " + accountIdToFind + ":");
        Accounts.Account foundAccount = accounts.findAccountById(accountIdToFind);
        if (foundAccount != null) {
            System.out.println(foundAccount);
        } else {
            System.out.println("Account with ID " + accountIdToFind + " not found.");
        }

        // Removing an account
        int accountIdToRemove = 1;
        accounts.removeAccount(accountIdToRemove);
        System.out.println("\nAll Accounts after removing Account with ID " + accountIdToRemove + ":");
        accounts.printAllAccounts();
    }
}
