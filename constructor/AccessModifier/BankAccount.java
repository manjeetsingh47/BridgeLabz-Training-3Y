package Constructor.AccessModifier;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        
        System.out.println("Account Number: " + accountNumber);
        
        System.out.println("Account Holder: " + accountHolder);
        
        System.out.println("Balance: $" + getBalance());
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("12345", "John Doe", 5000.00);
        sa.displaySavingsAccountDetails();

        sa.deposit(1500);
        sa.withdraw(2000);

        System.out.println("\nAfter transactions:");
        sa.displaySavingsAccountDetails();
    }
}


