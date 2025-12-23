# Day 4: Bank Account Management

## Problem Description
Create a `BankAccount` class to model basic banking operations.

**Requirements:**
- Properties: Account Number, Account Name, Balance.
- Methods: Deposit, Withdraw, Transfer.
- **Constraint**: Operations must not result in a negative balance.

## Approach
This task focused on **Encapsulation** and valid state management.

1.  **`BankAccount.java`**:
    -   **Private Fields**: Properties are `private` to prevent direct external access.
    -   **Constructor**: Validates initial balance (sets to 0 if negative).
    -   **`deposit(double amount)`**: helper method that adds to balance. Validates amount is positive.
    -   **`withdraw(double amount)`**: Checks if `amount > balance` before deducting. Returns `boolean` to indicate success/failure.
    -   **`transfer(BankAccount target, double amount)`**: 
        -   Leverages `withdraw()` to safely remove funds from the source.
        -   If `withdraw` succeeds, calls `deposit()` on the target.
        -   This ensures atomicity (money isn't created or lost if a step fails).

2.  **`Solution.java`**:
    -   Demonstrates the usage by creating two accounts (Alice and Bob) and performing a sequence of transactions to verify the logic.

## Key Takeaways
- **Encapsulation**: Protecting the internal state (`balance`) from invalid updates.
- **Method Reusability**: The `transfer` method reuses `withdraw` and `deposit`, reducing code duplication and centralizing validation logic.
