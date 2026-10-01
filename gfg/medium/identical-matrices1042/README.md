# identical-matrices1042

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T02:19:10.212Z  

```java
class Solution {
    public boolean identicalMat(int[][] mat1, int[][] mat2) {
        // code here
        int n=mat1.length;
        if(mat1.length==mat2.length){
            for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat1[0].length;j++){
                    if(mat1[i][j]!=mat2[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/identical-matrices1042/1)