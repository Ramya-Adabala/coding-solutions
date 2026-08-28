# ZWFPSZ04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading a Number and Repeating It

What is the expected output of the code below if the input is `25`?

```
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number and repeat it
        System.out.println("Here is your number again: ");
        System.out.println(scanner.nextInt());

        scanner.close();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:26:46.924Z  

```cpp
// Importing the Scanner class for user input
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the user's input directly and use it in an output statement
        // No variable is used to store the input; it is passed directly
        System.out.println("Oh, " + scanner.nextInt() + " is a great choice!");
        
        // Close the Scanner to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ04)