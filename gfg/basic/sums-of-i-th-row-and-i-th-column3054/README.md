# Sums of i-th row and i-th column

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a 2D integer array  **mat[][]**  of size  **n × m**, check whether for every index i, the sum of the ith row is equal to the sum of the ith column. Return  **true**  if the condition holds for all valid indices, otherwise return  **false**.

 **Note:**  If the matrix is not square (n != m), only compare indices up to min(n, m). For example, if there are 3 rows and 1 column, only compare the 1st row with the 1st column.

 **Examples:** 

```
Input: mat[][] = [[1, 2], [2, 1]]
Output: true
Explanation: Sum of 1st row = 1 + 2 = 3, and Sum of 1st column = 1 + 2 = 3. Similarly, Sum of 2nd row = 2 + 1 = 3, and Sum of 2nd column = 2 + 1 = 3. All corresponding row and column sums are equal.
```

```
Input: mat[][] = [[5], [0], [0]]
Output: true
Explanation: Only the first row and first column are considered. The sum of the first row is 5, and the sum of the first column is also 5. Both values are equal.
```

```
Input: mat[][] = [[1, 4, 2], [6, 1, 3]]
Output: false 
Explaination: Sum of the first row and first column are equal, but the sum of the second row is 10 which is not equal to the sum of the second column which is 5.
```

 **Constraints:** 
1 ≤ n, m ≤ 103   
0 ≤ mat[i][j] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T06:23:28.797Z  

```java
// User function Template for Java

class Solution {
    boolean sumOfRowCol( int A[][]) {
        int N=A.length;int M=A[0].length;
       int v=Math.min(N,M);
        int rsum=0,csum=0;
        for(int i=0;i<v;i++){
            for(int j=0;j<M;j++){
                rsum+=A[i][j];
            }
            for(int k=0;k<N;k++){
                csum+=A[k][i];
            }
            if(rsum!=csum){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1)