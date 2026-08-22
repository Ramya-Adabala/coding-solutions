# SGQHPG25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Increment - Decrement operators involved

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int z = 4;
        int result = --x + y++ + ++z - x-- - --y + z++;
        System.out.println(result);
   
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:25:15.638Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int purchases = 3; // Initial number of purchases

        // Calculating discount with pre-increment
        int discount = ++purchases * 2;

        // Printing discount and remaining purchases
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Remaining Purchases: " + --purchases);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG25)