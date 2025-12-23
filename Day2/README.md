# Day 2: Find Min & Max Salary (Refactoring to SRP)

## Problem Description
Develop a console application to read employee salary data from a CSV file (`salarysheet.csv`) and determine the employee with the minimum and maximum salary.

**Requirements:**
- Read from CSV.
- Display Max salary with name.
- Display Min salary with name.
- Adhere to OOP principles.

## Approach & Refactoring
Initially, a monolithic solution was created. However, to adhere to **Professional OOP** standards, we refactored the code to follow the **Single Responsibility Principle (SRP)**.

### Refactored Architecture:
1.  **`Employee.java` (Model)**:
    -   Responsible purely for holding data (Name, Salary).
    -   Follows **Encapsulation**.

2.  **`SalaryDataReader.java` (Data Access)**:
    -   Responsible **ONLY** for reading the raw data from the CSV file.
    -   Parses lines and handles file exceptions.
    -   Returns a list of `Employee` objects.

3.  **`SalaryAnalyzer.java` (Business Logic)**:
    -   Responsible **ONLY** for calculating statistics.
    -   Contains methods `findMaxSalaryWithEmployeeName` and `findMinSalaryWithEmployeeName`.

4.  **`solutions.java` (Controller/Orchestrator)**:
    -   Entry point of the application.
    -   Delegates tasks to the Reader and Analyzer.
    -   Prints the final results (View logic).

## Key Takeaways
- **SRP (Single Responsibility Principle)**: Each class has one job. This makes the code easier to maintain and test.
- **Separation of Concerns**: File I/O is separated from Business Calculations.
