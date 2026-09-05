# PWTIEX15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Information Collector

Write a program to collect and display student details. The program should use a class with instance variables to store the student’s name, roll number, and grade. The values should be assigned directly through user input without using methods or multiple objects.

 **Input:** 

- A string representing the student’s name.
- An integer representing the student’s roll number.
- A double representing the student’s grade.
### Sample 1:
Input
Output

```
John Doe
101
89.5
```

```
Student Details:
Name: John Doe
Roll Number: 101
Grade: 89.5

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T09:59:46.666Z  

```java
import java.util.Scanner;

class Student {
    // Instance variables
    String name;
    int rollNumber;
    double grade;
    
    
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of Student
        Student s1 = new Student();

        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input for the student's details
  
  s1.name=sc.nextLine();
  s1.rollNumber=sc.nextInt();
  s1.grade=sc.nextDouble();



        // Display the student's details using instance variables
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Grade: " + s1.grade);

        // Close scanner
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX15)