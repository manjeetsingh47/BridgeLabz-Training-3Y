package workshop_11_9_25;
// Abstract class as a blueprint
abstract class Account {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods (must be implemented by child classes)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    // Common method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }
}

// Savings Account Class
class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }
}

// Current Account Class
class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000; // Overdraft allowed

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        // Current account usually has no interest
        System.out.println("No interest for Current Account.");
    }
}

// Main class to test the Banking System
public class BankingSystem {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA123", 10000);
        Account current = new CurrentAccount("CA456", 5000);

        // Savings Account Operations
        savings.deposit(2000);
        savings.withdraw(1500);
        savings.calculateInterest();
        savings.displayBalance();

        System.out.println("---------------");

        // Current Account Operations
        current.deposit(3000);
        current.withdraw(9000);
        current.calculateInterest();
        current.displayBalance();
    }
}