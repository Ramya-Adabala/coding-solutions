# Repeated Removal of Kth

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **k**, consider the integers from 1 to n. In each operation, keep every kth remaining integer and remove all others. Repeat this process until the number of remaining integers becomes less than k. Return the smallest integer among the remaining integers.

 **Examples:** 

```
Input: n = 30, k = 3
Output: 27
Explanation: After the first operation, the remaining integers are: 3 6 9 12 15 18 21 24 27 30. Similarly, after the second operation: 9 18 27, and after the third operation: 27. Therefore, the smallest remaining integer is 27.
```

```
Input: n = 18, k = 3
Output: 9
Explanation: After the first operation, the remaining integers are: 3 6 9 12 15 18. Similarly, after the second operation: 9 18. Since the number of remaining integers is now less than k, the process stops. Therefore, the smallest remaining integer is 9.
```

 **Constraints** 
1 ≤ n ≤ 105
2 ≤ k ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T13:11:06.703Z  

```java
class Solution {
    public int getCandidate(int n, int k) {
        // code here
        int c=0;
        while(n>=k){
            n=n/k;
            c++;
        }
        return (int)Math.pow(k,c);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ishaans-internship4400/1)