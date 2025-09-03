package oops.level_2;

    class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } 
        return false;
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890", 1000);
        account.displayBalance();

        account.deposit(500);
        account.displayBalance();

        if (account.withdraw(300)) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
        account.displayBalance();

        if (!account.withdraw(1500)) {
            System.out.println("Insufficient balance");
        }
        account.displayBalance();
    }
}


