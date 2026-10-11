class Employee {
    // Instance variables
    String name;
    String department;
    int employeeId;

    // Parameterized constructor to initialize employee details
    public Employee(String empName, String empDepartment, int empId) {
        name = empName;
        department = empDepartment;
        employeeId = empId;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
    }

    public static void main(String[] args) {
        // Creating an object
        Employee emp1 = new Employee("Alice", "Finance", 1024);

        // Calling the method to display employee information
        emp1.displayInfo();
    }
}