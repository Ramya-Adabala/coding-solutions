# JAVATC05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T04:24:23.841Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int num = Integer.parseInt(scanner.nextLine());  // Attempt to convert input to an integer
            System.out.println(num);
        } catch (NumberFormatException e) {  // Handle cases where input is not a valid integer
            System.out.println("Invalid Integer");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATC05)