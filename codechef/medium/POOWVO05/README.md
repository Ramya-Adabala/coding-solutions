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
**Submitted:** 2026-09-03T04:26:59.223Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        int number; // Declare a variable to store the user input

        // Infinite loop to repeatedly prompt user for input
        while(true){
            number=sc.nextInt();
            if(number%5==0 && number%3==0){
                break;
            }
            else{
                System.out.println("Invalid input! Enter a number divisible by both 3 and 5.");
            }
        }








        // Print the valid number that satisfies the condition
        System.out.println("Valid input! " + number + " is divisible by both 3 and 5.");
        
        sc.close(); // Close the scanner to free system resources
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO05)