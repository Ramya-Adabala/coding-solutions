# STACK12V - Rating 450

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:09:57.500Z  

```java
static int peek() {
    if (top >= 0) {
        int ele = a[top];
        System.out.println("Peeked: " + ele);
        return ele;
    } else {
        System.out.println("Stack is empty. Cannot peek.");
        return -1;
    }
}

static boolean is_empty() {
    return top == -1;
}

static boolean is_full() {
    return top >= MAX_SIZE;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/STACK12V)