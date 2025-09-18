package workshop_17_09_25;

class BankAccount {
    private String accountNumber;
    private double balance;
    private final int pin;   
    
    public static void main(String[] args) {
        
        BankAccount acc = new BankAccount("ACC123", 500, 1234);

        
        acc.deposit(200);     
        acc.withdraw(100);    
        acc.withdraw(700);    
        acc.deposit(-50);     

        
        System.out.println("Final Balance: " + acc.getBalance());
        System.out.println("Account Number: " + acc.getAccountNumber());
    }
    
    public BankAccount(String accountNumber, double initialBalance, int pin) {
        this.accountNumber = accountNumber;

        
        if (initialBalance < 0) {
            this.balance = 0;
            System.out.println(" Initial balance cannot be negative. Set to 0.");
        } else {
            this.balance = initialBalance;
        }

        this.pin = pin; 
    }

    
    public double getBalance() {
        return balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Deposit amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println(" Deposited: " + amount);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Withdrawal amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println(" Insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.println(" Withdrew: " + amount);
        return true;
    }
}

