# NDLQGP25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Updating Product Descriptions

In an e-commerce platform, some product descriptions contain outdated or inconsistent terminology. Your task is to standardize the descriptions by:

- Replacing all occurrences of the word "colour" with "color".
- Converting the final description to uppercase.
- Printing the updated product description.

 **Expected Output:** 

```
THIS SHIRT IS AVAILABLE IN MULTIPLE COLORS.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T02:14:15.855Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String description = "This shirt is available in multiple colours.";
        description=description.replace("colours","color");
       System.out.println(description);
        

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP25)