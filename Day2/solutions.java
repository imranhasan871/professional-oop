package Day2;

import java.util.Scanner;

public class solutions {
    public static void main(String[] args) {
      // read file from csv file
      Scanner scanner = new Scanner(System.in);
      String fileName = "salarysheet.csv";
      
      try {
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
          String name = scanner.next();
          int salary = Integer.parseInt(scanner.next());
          System.out.println(name + " " + salary);
          
        }
      } catch (Exception e) {
        System.out.println("File not found");
      }
      
      scanner.close();
  
    }
}
