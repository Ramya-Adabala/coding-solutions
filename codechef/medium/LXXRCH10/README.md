# LXXRCH10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculator Class
- Write a Java program to demonstrate the use of a default constructor and a method in performing a basic arithmetic operation.
- The program should automatically display a welcome message when the calculator object is created:

```
Calculator is ready.

```

- Then a method should be used to accept two integer values as user input and then calculate and display their sum in the format: Sum = <result>.
### Sample 1:
Input
Output

```
10 
20
```

```
Calculator is ready.
Sum = 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:24:01.629Z  

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

[View on CodeChef](https://www.codechef.com/problems/LXXRCH10)