//by Muhammad Aiman Haikal Bin Mohammad Akmal Surish 24000458

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
