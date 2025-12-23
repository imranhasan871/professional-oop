package Day2;

import java.util.List;

public class solutions {

    public static void main(String[] args) {
        
        String fileName = "salarysheet.csv";
        
        SalaryDataReader dataReader = new SalaryDataReader();
        List<Employee> salaryList = dataReader.readDataFromCSVFile(fileName);

        if (salaryList.isEmpty()) {
            System.out.println("No data loaded.");
            return;
        }

        SalaryAnalyzer analyzer = new SalaryAnalyzer();

        Employee maxEmployee = analyzer.findMaxSalaryWithEmployeeName(salaryList);
        if (maxEmployee != null) {
            System.out.println("Max: " + maxEmployee.getName() + "\t" + maxEmployee.getSalary());
        }
    }
}
