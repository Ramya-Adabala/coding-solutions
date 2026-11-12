# RESUFF04 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Years of Experience

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int yearsOfExperience = 7;

        if (yearsOfExperience > 10) {
            System.out.println("Senior Employee");
        } else if (yearsOfExperience >= 5) {
            System.out.println("Mid-Level Employee");
        } else {
            System.out.println("Junior Employee");
        }

    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T15:40:55.771Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'age' with a predefined value of 16
        int age = 16; 

        // Check if the age is less than 13
        if (age < 13) {
            System.out.println("You are a child."); 
        } 
        // Check if the age is between 13 and 19 (inclusive)
        else if (age <= 19) { // Teenagers fall into this category
            System.out.println("You are a teenager."); 
        } 
        // If the age is greater than 19
        else {
            System.out.println("You are an adult."); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF04)