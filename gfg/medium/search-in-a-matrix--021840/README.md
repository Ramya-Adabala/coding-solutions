# search-in-a-matrix--021840

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:27:19.563Z  

```java
class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for (int i = 0; i < mat.length; i++) {
                   
                   for (int j = 0; j < mat[i].length; j++) {
                  
                       if (mat[i][j] == x) {
                           return true;
                       }
                   }
               }
             
               return false;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-a-matrix--021840/1)