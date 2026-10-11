# LXXRCH09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How Constructors and Methods Execute

What will be the output of the following Java program?

```
class Demo {
    Demo() {
        System.out.println("Constructor Called");
    }
    
    void show() {
        System.out.println("Hello, Java!");
    }
}

class Codechef {
   public static void main(String[] args) {
       Demo obj = new Demo();
       obj.show();
   }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:23:47.312Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/LXXRCH09)