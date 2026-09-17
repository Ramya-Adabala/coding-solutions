# JNQEBY19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T09:35:43.732Z  

```java
class Codechef {
    // Instance variables for the account holder's name and balance
    String accountHolderName;
    double accountBalance;

    // Parameterized constructor to initialize name and balance using 'this' keyword
    public Codechef(String name, double balance) {
        this.accountHolderName = name;  // 'this' refers to the instance variable accountHolderName
        this.accountBalance = balance;  // 'this' refers to the instance variable accountBalance
    }

    public static void main(String[] args) {
        // Create an object of Codechef class with a parameterized constructor
        Codechef account = new Codechef("Alice", 1500.0);  // Initializing with name and balance
        
        // Display the account details directly inside main method
        System.out.println("Account Holder: " + account.accountHolderName);  // Accessing the name
        System.out.println("Account Balance: " + account.accountBalance);  // Accessing the balance
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY19)