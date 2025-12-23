package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This class is ONLY responsible for reading salary data from a source (CSV file).
public class SalaryDataReader {

    public List<Employee> readDataFromCSVFile(String fileName) {
        List<Employee> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            // Fallback check for running from different directories
            if (!file.exists()) {
               File alternate = new File("Day2/" + fileName);
               if (alternate.exists()) file = alternate;
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String name = parts[0].trim();
                     // Basic error handling for parsing
                    try {
                        int salary = Integer.parseInt(parts[1].trim());
                        list.add(new Employee(name, salary));
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid data: " + line);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found (" + fileName + ")");
        }
        return list;
    }
}
