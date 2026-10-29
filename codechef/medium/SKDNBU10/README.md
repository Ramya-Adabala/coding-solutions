# SKDNBU10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Interest Calculator

Write a program to calculate the new account balance after adding interest using the  **addition assignment (`+=`)**  operator. The interest is added to the existing balance, and the program should display the updated balance.

 **Expected Output:** 
If stored and printed correctly, your output should look something like:

```
5251.25

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T02:57:21.682Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial account balance and interest amount
        double accountBalance = 5000.50, interest = 250.75;

        // Add interest to the account balance using +=
        accountBalance += interest;

        // Print the updated account balance
        System.out.println(accountBalance);  // Prints the new balance after interest is added
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU10)