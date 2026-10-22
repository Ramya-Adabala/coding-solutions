# Check Identical Matrices

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two square matrices  **mat1[][]** and  **mat2[][]**  of size  **n × n**, determine whether the matrices are identical or not.

 **Examples:** 

```
Input: mat1[][] = [[1, 2], [3, 4]], mat2[][] = [[1, 2], [3, 4]]
Output: true
Explanation: Both the matrices are identical, so the answer is 1.
```

```
Input: mat1[][] = [[1, 2], [3, 4], mat2[][] = [[1, 2], [3, 2]]
Output: false
Explanation: Both the matrices are not identical, So, answer is 0.
```

 **Constraints:** 
1 ≤ n ≤ 1000
-1000 ≤ mat1[i][j], mat2[i][j] ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T07:18:17.559Z  

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