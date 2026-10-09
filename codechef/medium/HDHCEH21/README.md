# HDHCEH21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Observe Default Values for a Product Class

In this example, we demonstrate a Product class without assigning any values to its attributes. As a result, the default values are printed for all class attributes.

 **Your output would look like** 

```
Product ID: 0
Name: null
Price: 0.0
In Stock: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:25:28.369Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH21)