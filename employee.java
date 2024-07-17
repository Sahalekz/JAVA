public class Employee {
    // Attributes
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }

    // Method to give a raise to the employee
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Raise of " + percentage + "% given to " + name);
        } else {
            System.out.println("Invalid raise percentage. No changes made.");
        }
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary + " per month");
        System.out.println("Yearly Salary: $" + calculateYearlySalary());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp1 = new Employee("John Doe", 1001, 50000);

        // Display initial employee information
        emp1.displayEmployeeInfo();

        // Give a raise of 10%
        emp1.giveRaise(10);

        // Display updated employee information
        emp1.displayEmployeeInfo();
    }
}

