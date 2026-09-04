# POOWVO16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### PIN Verification

A PIN verification system prompts the user until they enter the correct PIN.
The program uses a  **flag-controlled loop**  to repeatedly check user input before granting access.

 **Steps to Complete:** 

- Use a while loop to keep asking for input until the correct PIN is entered.
- Compare the entered PIN with the stored PIN.
- If the PIN matches, update the flag and print "Access granted!".
- If incorrect, display "Invalid PIN. Try again." and prompt the user again.
### Sample 1:
Input
Output

```
1111
9999
1234
```

```
Invalid PIN. Try again.  
Invalid PIN. Try again.  
Access granted!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T05:11:56.561Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        int correctPIN = 1234; // Define the correct PIN
        boolean isVerified = false; // Flag to control the loop

        // Loop continues until the correct PIN is entered
        while (!isVerified) {
            //System.out.print("Enter your 4-digit PIN: ");
            int userPIN = scanner.nextInt(); // Read user input

            // Check if the entered PIN matches the correct PIN
            if (userPIN == correctPIN) {
                isVerified = true; // Set flag to true to exit loop
                System.out.println("Access granted!"); // Display success message
            } else {
                System.out.println("Invalid PIN. Try again."); // Prompt user to re-enter
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO16)