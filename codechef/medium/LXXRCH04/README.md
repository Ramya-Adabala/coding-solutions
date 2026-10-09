# LXXRCH04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Default Values and Implicit Constructor in Java

What will be the output of the following code?

```
class Car {
    int speed;
    String model;
}

class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();

        // Printing default values of instance variables
        System.out.println("Car speed is " + myCar.speed);
        System.out.println("Car model is " + myCar.model);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:29:13.765Z  

```cpp
class Student {
    // Instance variables to store student's name and grade
    String studentName;
    int grade;

    // Constructor that initializes the student with predefined values
    Student() {
        studentName = "Alice";  
        grade = 8;   
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student();

        // Displaying the student's information
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Grade: " + s1.grade);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH04)