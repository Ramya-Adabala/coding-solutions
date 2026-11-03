# QUOMQD20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Searching for a Product Keyword

Write a program to extract the  **brand name**  from a  **product description**.

```
String productDescription = "Laptop HP Pavilion";

```

 **Expected Output:** 

```
HP 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T10:51:14.247Z  

```java
class Codechef {
    public static void main(String[] args) {
        //  Define a string
        String productDescription = "Laptop HP Pavilion";

        // Extract the brand name starting from index 7
        String brand = productDescription.substring(7, 9);


        System.out.println(brand);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD20)