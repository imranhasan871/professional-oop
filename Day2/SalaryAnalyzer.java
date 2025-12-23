package Day2;

import java.util.List;

// This class is ONLY responsible for analyzing/calculating salary statistics.
public class SalaryAnalyzer {

    public Employee findMaxSalaryWithEmployeeName(List<Employee> salaryList) {
        if (salaryList == null || salaryList.isEmpty()) return null;

        Employee maxEmp = salaryList.get(0);
        for (Employee emp : salaryList) {
            if (emp.getSalary() > maxEmp.getSalary()) {
                maxEmp = emp;
            }
        }
        return maxEmp;
    }

    public Employee findMinSalaryWithEmployeeName(List<Employee> salaryList) {
        if (salaryList == null || salaryList.isEmpty()) return null;

        Employee minEmp = salaryList.get(0);
        for (Employee emp : salaryList) {
            if (emp.getSalary() < minEmp.getSalary()) {
                minEmp = emp;
            }
        }
        return minEmp;
    }
}
