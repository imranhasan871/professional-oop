package Day4;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        // Ensure initial balance is not negative
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + this.balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient funds for withdrawal. Current Balance: " + this.balance);
            return false;
        }
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New Balance: " + this.balance);
        return true;
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            System.out.println("Target account does not exist.");
            return;
        }
        
        System.out.println("Initiating transfer of " + amount + " to " + targetAccount.getAccountName());
        // Try to withdraw first
        if (this.withdraw(amount)) {
            // If successful, deposit to target
            targetAccount.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
