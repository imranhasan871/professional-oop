package Day3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class VoucherManager {

    public void generateVoucher(List<GroceryItem> items, String outputFileName) {
        StringBuilder sb = new StringBuilder();
        
        // Header
        sb.append(String.format("%-15s %-10s %-15s %-15s\n", "Item id", "Qty", "unit price", "total"));
        
        double grandTotal = 0;
        int totalQty = 0;

        for (GroceryItem item : items) {
            sb.append(String.format("%-15s %-10d %-15.1f %-15.1f\n", 
                item.getItemId(), 
                item.getQuantity(), 
                item.getUnitPrice(), 
                item.getTotalPrice()));
            
            grandTotal += item.getTotalPrice();
            totalQty += item.getQuantity();
        }

        double vat = grandTotal * 0.05;
        double netTotal = grandTotal - vat; // Based on the example output logic (4658.5 - 232.925 = 4425)

        sb.append("\n");
        sb.append(String.format("%-15s %-10d %-15s %,.1f\n", "Total", totalQty, "Grand total", grandTotal));
        sb.append(String.format("%-15s %-10s %-15s %.3f\n", "VAT (5%)", "", "", vat));
        sb.append(String.format("%-15s %-10s %-15s %.3f\n", "Net total", "", "", netTotal));

        String voucherContent = sb.toString();

        // 1. Display on Console
        System.out.println(voucherContent);

        // 2. Save to File
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            writer.print(voucherContent);
            System.out.println("Voucher saved to " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
