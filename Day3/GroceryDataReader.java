package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GroceryDataReader {

    public List<GroceryItem> readItemsFromCSV(String fileName) throws Exception {
        List<GroceryItem> items = new ArrayList<>();
        Set<String> itemIds = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        File file = new File(fileName);
        if (!file.exists()) {
             // Try a fallback path if running from root 
             File alternate = new File("Day3/" + fileName);
             if (alternate.exists()) file = alternate;
             else throw new FileNotFoundException("File not found: " + fileName);
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) continue;

            // Assuming CSV format: ID, Quantity, UnitPrice
            // Handling both comma or user's tab/space structure if needed, but standardizing on comma based on common CSV practices and previous task.
            // Problem description shows spaces/tabs in visual, but says "CSV file". I will assume standard CSV (comma) or adapt if parse fails.
            // Actually, Day2 was comma. I'll stick to comma for the file I created.
            
            String[] parts = line.split(",");
             if (parts.length < 3) {
                // specific hack for tab/space separation if comma fails, just in case
                parts = line.split("\\s+");
            }

            if (parts.length >= 3) {
                String id = parts[0].trim();
                
                // Check for duplicates
                if (itemIds.contains(id)) {
                    duplicates.add(id);
                } else {
                    itemIds.add(id);
                }

                try {
                    int qty = Integer.parseInt(parts[1].trim());
                    double price = Double.parseDouble(parts[2].trim());
                    items.add(new GroceryItem(id, qty, price));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid number format in line: " + line);
                }
            }
        }
        scanner.close();

        if (!duplicates.isEmpty()) {
            throw new Exception("Duplicate Item IDs found: " + String.join(", ", duplicates));
        }

        return items;
    }
}
