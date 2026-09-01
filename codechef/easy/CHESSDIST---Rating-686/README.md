# CHESSDIST - Rating 686

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T04:47:31.844Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Using Scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int x = sc.nextInt(); // Target stair
            int y = sc.nextInt(); // Size of the large step
            
            // Calculate minimum moves: max Y-steps + remaining 1-steps
            int minMoves = (x / y) + (x % y);
            
            // Output the result for the current test case
            System.out.println(minMoves);
        }
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHESSDIST)