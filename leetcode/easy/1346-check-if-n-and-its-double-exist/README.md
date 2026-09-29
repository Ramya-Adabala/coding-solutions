# Check If N and Its Double Exist

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `arr` of integers, check if there exist two indices `i` and `j` such that :

- i != j
- 0 <= i, j < arr.length
- arr[i] == 2 * arr[j]

 

 **Example 1:** 

```
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2  *5 == 2*  arr[j]

```

 **Example 2:** 

```
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.

```

 

 **Constraints:** 

- 2 <= arr.length <= 500
- -103 <= arr[i] <= 103

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.13%)  
**Memory:** 44.8 MB (beats 46.27%)  
**Submitted:** 2026-09-29T02:38:49.861Z  

```java
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num*2)){
                return true;
            }
            if(num%2==0 && set.contains(num/2))
            return true;
        set.add(num);
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-n-and-its-double-exist/)