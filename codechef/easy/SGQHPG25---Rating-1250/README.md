# SGQHPG25 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

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
**Submitted:** 2026-10-31T05:57:23.332Z  

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