package Day4;

public class Solution {
    public static void main(String[] args) {
        // Create accounts
        BankAccount account1 = new BankAccount("ACC-001", "Alice", 1000.0);
        BankAccount account2 = new BankAccount("ACC-002", "Bob", 500.0);

        System.out.println("--- Initial State ---");
        System.out.println(account1.getAccountName() + ": " + account1.getBalance());
        System.out.println(account2.getAccountName() + ": " + account2.getBalance());
        System.out.println();

        // Test Deposit
        System.out.println("--- Testing Deposit ---");
        account1.deposit(200.0); // Alice: 1200
        System.out.println();

        // Test Withdrawal
        System.out.println("--- Testing Withdrawal ---");
        account1.withdraw(1500.0); // Fail
        account1.withdraw(200.0);  // Success, Alice: 1000
        System.out.println();

        // Test Transfer
        System.out.println("--- Testing Transfer ---");
        // Transfer 300 from Alice to Bob
        account1.transfer(account2, 300.0); 
        // Expected: Alice 700, Bob 800

        System.out.println();
        System.out.println("--- Final State ---");
        System.out.println(account1.getAccountName() + ": " + account1.getBalance());
        System.out.println(account2.getAccountName() + ": " + account2.getBalance());
    }
}
