# Day 3: Grocery Voucher Generator

## Problem Description
Develop a console application to read grocery items from a CSV file, check for duplicates, and generate a formatted voucher. The voucher must calculate line totals, a grand total, 5% VAT, and a net total.

**Requirements:**
- Read `groceryitems.csv` (Item ID, Quantity, Unit Price).
- Detect and report duplicate Item IDs.
- Calculate:
    - Line Total (Qty * Price)
    - Grand Total (Sum of line totals)
    - VAT (5% of Grand Total)
    - Net Total (Grand Total + VAT)
- Output: Console display and save to `voucher.txt`.

## Approach
We continued applying OOP principles, focusing on modularity and clean data handling.

1.  **`GroceryItem.java`**:
    -   Encapsulates item details.
    -   Includes a helper method `getTotalPrice()` to centralize the line-total calculation.

2.  **`GroceryDataReader.java`**:
    -   Handles file I/O using `Scanner`.
    -   **Validation**: Implemented logic to detect duplicate IDs using a `HashSet`. If duplicates are found, execution stops or warns the user.

3.  **`VoucherManager.java`**:
    -   Responsible for the "Business Logic" of calculating the final totals (VAT, Net).
    -   Responsible for the "Presentation" (formatting the string using `String.format` for alignment).
    -   Handles output to both Console and File.

4.  **`Solution.java`**:
    -   Orchestrates the flow: Read -> Process/Generate.

## Key Takeaways
- **Input Validation**: Handling dirty data (duplicates) via the Reader.
- **Formatting**: Using `String.format` ("%-15s") for professional-looking aligned tables in the console/text file.
