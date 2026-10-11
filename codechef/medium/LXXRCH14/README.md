# LXXRCH14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Constructor Behavior in Java

What will be the output of the following Java program?

```
class Car {
    // Instance variables
    String brand;
    String model;
    int year;

    // Parameterized constructor to initialize car details
    public Car(String carBrand, String carModel, int carYear) {
        brand = carBrand;
        model = carModel;
        year = carYear;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.displayDetails();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:24:29.307Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/LXXRCH14)