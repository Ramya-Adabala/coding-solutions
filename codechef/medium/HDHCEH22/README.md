# HDHCEH22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Default value for float

What would be the  **output**  for the following Java code?

```
 class DefaultValues{
     int a;
     float b;
     public static void main(String [] args){
           DefaultValues obj = new DefaultValues();
           System.out.println(obj.a);
           System.out.println(obj.b);
   }
 }

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:26:31.145Z  

```cpp
class Product {
    int id;
    String name;
    double price;
    boolean inStock;
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Product ID: " + p.id);         // default int -> 0
        System.out.println("Name: " + p.name);              // default String -> null
        System.out.println("Price: " + p.price);            // default double -> 0.0
        System.out.println("In Stock: " + p.inStock);       // default boolean -> false
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH22)