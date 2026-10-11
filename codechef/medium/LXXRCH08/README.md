# LXXRCH08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - BankAccount Class

In this example, we will demonstrate the difference between a constructor and a method. The constructor will display a message indicating that a new bank account has been created, while the method will simulate displaying the current account balance.

 **Expected Output:** 

```
Bank account created.
Current balance is 0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:23:34.313Z  

```java
class BankAccount {
    int balance;

    // Constructor: initializes balance and displays creation message
    BankAccount() {
        balance = 0;  // default balance
        System.out.println("Bank account created.");
    }

    // Method: displays the current account balance
    void showBalance() {
        System.out.println("Current balance is " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object (constructor is called)
        BankAccount account1 = new BankAccount();
        
        // Manually calling the method using the object reference
        account1.showBalance();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH08)