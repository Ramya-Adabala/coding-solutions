# DCTRHJ35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product Review Verification

Write a program to verify if two customer reviews match regardless of case using the `equalsIgnoreCase()` method.
The program should store two product reviews from different users and compare them while also displaying the product price.

 **Expected Output:** 

```
Product ID: 1024  
Product Price: $249.99  
Review Match: true  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:05:26.334Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String review1 = "Excellent Product";
        String review2 = "excellent product";
        double productPrice = 249.99;
        int productId = 1024;

        // Complete the below code
        boolean isMatch = review1.equals(review2);
        System.out.println("Product ID: "+productId);
        System.out.println("Product Price: "+productPrice);
        System.out.println("Review Match: "+isMatch);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ35)