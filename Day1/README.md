# Day 1: Working with Array/ArrayList

## Problem Description
Create a list of employee names and find out the partial matching with user input.

**Requirements:**
- Hardcoded list of names.
- Case-insensitive search.
- User input "sa" should match "Afsana", "Samia".

## Approach
1.  **Data Structure**: Used a simple String array to store the names.
2.  **Search Logic**: Iterated through the array using an enhanced `for` loop.
3.  **String Matching**: Used `String.toLowerCase()` and `String.contains()` to find partial matches regardless of case.
4.  **Output**: Printed matching names to the console.

## Code Structure
- `solution.java`: Contains the main method and the logic for the search.
