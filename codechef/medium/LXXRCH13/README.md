# LXXRCH13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee details with Parameterized constructor
- In this example, we demonstrate how to use a parameterized constructor to initialize an employee's name, department, and employee ID. The constructor allows us to set the initial values for the employee's information at the time of object creation.
- The details of the employee will then be displayed using the displayInfo method.

 **When executed, the code will display:** 

```
Employee Name: Alice
Department: Finance  
Employee ID: 1024

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:24:18.717Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH13)