# LXXRCH11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:24:03.144Z  

```java
import java.util.Scanner;

class Calculator {
    // Default constructor: displays a welcome message
    Calculator() {
        System.out.println("Calculator is ready.");
    }

    // Method to take input and display the sum
    void calculateSum() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        
        sc.close();
    }
}

class Codechef {
    public static void main(String[] args) {
        // Constructor is called when the object is created
        Calculator calc = new Calculator();

        // Method is called manually to perform the action
        calc.calculateSum();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH11)