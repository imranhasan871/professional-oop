package Day2;

// OOP Principle: Encapsulation - The Employee class is now in its own file
// Responsible for holding the data of a single employee.
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
