package Day3;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String inputFileName = "groceryitems.csv";
        String outputFileName = "voucher.txt";

        try {
            GroceryDataReader reader = new GroceryDataReader();
            List<GroceryItem> items = reader.readItemsFromCSV(inputFileName);

            VoucherManager manager = new VoucherManager();
            manager.generateVoucher(items, outputFileName);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
