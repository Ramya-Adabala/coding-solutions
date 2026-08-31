# WNDHVZ41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T04:47:28.839Z  

```java
import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        if(weight<=20){
           System.out.println("Your luggage is within the allowed limit."); 
        }
        else{
            System.out.println("Your luggage exceeds the limit by 5 kg. Additional charges may apply.");
        }
        System.out.println("Luggage check completed.");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ41)