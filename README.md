# Professional OOP Practice Journey

This repository contains my **ongoing** daily coding practice focused on mastering **Object-Oriented Programming (OOP)**, **Clean Code**, and **SOLID Principles** using Java.

Each day focuses on a specific problem or concept, progressively building complexity and applying better architectural patterns. Use this log to track the journey.

## Directory Structure & Progress

| Day | Topic | Key Concepts |
|-----|-------|--------------|
| **[Day 1](./Day1)** | Employee Search | Array iteration, String matching, Basic Logic. |
| **[Day 2](./Day2)** | Salary Aganlyzer | **SRP (Single Responsibility Principle)**, Encapsulation, separating Data vs Logic. |
| **[Day 3](./Day3)** | Voucher Setup | File I/O, Exception Handling, Formatted Output, Data Validation (duplicates). |
| **[Day 4](./Day4)** | Bank Account | **Encapsulation**, State validation, Inter-object communication (Transfer). |
| **...**             | *More to come*| *Continuing the journey...* |

## OOP Concepts Learned (So Far)

### 1. Encapsulation (Data Hiding)
*   **Concept**: Bundling the data (variables) and the methods (functions) that act on the data into a single unit (class), and restricting access to some of the object's components.
*   **Application**: 
    *   In **Day 2**, we moved employee data into a dedicated `Employee` class.
    *   In **Day 4**, we made `balance` private in `BankAccount`. External code cannot modify the balance directly (e.g., `acc.balance = 5000` is impossible). It *must* go through `deposit()` or `withdraw()`, ensuring rules are followed (no negative balance).

### 2. Single Responsibility Principle (SRP)
*   **Concept**: A class should have one, and only one, reason to change.
*   **Application**: 
    *   In **Day 2**, instead of one giant `solutions` file, we split the code:
        *   `SalaryDataReader`: Only handles **Input** (reading CSV).
        *   `SalaryAnalyzer`: Only handles **Logic** (finding max/min).
        *   `Employee`: Only holds **Data**.
    *   This makes the code easier to debug. If the file format changes, we only touch `SalaryDataReader`.

### 3. Object Interaction & State Management
*   **Concept**: Objects communicating with each other to perform complex tasks while maintaining valid internal states.
*   **Application**: 
    *   In **Day 4**'s `transfer` method, one `BankAccount` object interacts with another.
    *   We re-used the `withdraw` logic inside `transfer` to ensure money is only sent if the sender actually has it. This prevents "creating money out of thin air" and keeps the system state consistent.

### 4. Modularization & Separation of Concerns
*   **Concept**: Dividing a computer program into distinct, independent units.
*   **Application**: 
    *   In **Day 3**, the logic for generating the `Voucher` text was separated from the logic that reads the `Grocery` items. This separation means we could easily swap the CSV reader for a Database reader later without rewriting the Voucher generator.


## How to Run
Each folder contains a `Solution.java` (or `solution.java` for earlier days). You can run them via the terminal:

```bash
cd DayX
javac *.java
java Solution
```

## Tools
- Language: Java
- Environment: VS Code