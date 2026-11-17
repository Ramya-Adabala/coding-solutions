# POOWVO05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate number divisible by 3 and 5

A program that ensures the user enters a  **positive number**  that is  **divisible by both 3 and 5**. The program will keep asking for input until a valid number is entered.

 **Steps to Complete:** 

- Prompt the user to enter a positive number.
- Use a while loop to check if the number is divisible by both 3 and 5.
- If the input is invalid, display an error message and ask for input again.
- Once a valid number is entered, print a success message.
### Sample 1:
Input
Output

```
7
12
30
```

```
Invalid input! Enter a number divisible by both 3 and 5.
Invalid input! Enter a number divisible by both 3 and 5.
Valid input! 30 is divisible by both 3 and 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:55:06.574Z  

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

[View on CodeChef](https://www.codechef.com/problems/POOWVO05)