# LXXRCH03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Constructors Basics and Default

In this example, we will demonstrate how to use a  **Default constructor**  to initialize the properties of a Student object. The constructor will set predefined values for the student's name and grade.

 **Expected Output:** 

```
Student Name: Alice  
Grade: 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:29:02.475Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/LXXRCH03)