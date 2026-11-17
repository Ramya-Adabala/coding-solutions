# POOWVO06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:55:09.857Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        int number; // Declare a variable to store the user input

        // Infinite loop to repeatedly prompt user for input
        while (true) {
            number = scanner.nextInt(); // Read the user input

            // Check if the number is positive and divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                break; // Exit the loop when a valid number is entered
            } else {
                System.out.println("Invalid input! Enter a number divisible by both 3 and 5."); // Prompt for correct input
            }
        }

        // Print the valid number that satisfies the condition
        System.out.println("Valid input! " + number + " is divisible by both 3 and 5.");
        
        scanner.close(); // Close the scanner to free system resources
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO06)