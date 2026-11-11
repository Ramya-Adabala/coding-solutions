# K-th Distinct in Order of Appearance

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, find the k-th distinct element in the array. A distinct element that appears exactly once in the entire array.  Distinct elements are considered in the same order as they appear in the array.

Return the  **k-th**  distinct element if it exists; otherwise, return  **-1**.

 **Examples:** 

```
Input: arr[] = [1, 2, 1, 3, 4, 2], k = 2
Output: 4
Explanation: The elements that appear exactly once are 3 and 4. In their order of appearance, the 2nd distinct element is 4.

```

```
Input: arr[] = [5, 1, 2, 5, 3, 2, 4], k = 3
Output: 4
Explanation: The elements that appear exactly once are 1, 3, and 4. The 3rd distinct element is 4.

```

 **Constraints:** 
1 ≤ n ≤ 105, where n is the length of the array
1 ≤ arr[i] ≤ 106
1 ≤ k ≤ n

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T13:28:23.607Z  

```java
// User function Template for Java

class Solution {
    public int kthDistinct(int[] nums, int k) {
        // Code here
         Map<Integer,Integer> obj=new LinkedHashMap<>();
    for (int num : nums) {
            obj.put(num, obj.getOrDefault(num, 0) + 1);
        }

        for (int n : nums) {
            if (obj.get(n) == 1)
            { k--;
            
              if(k==0)  return n ;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/k-th-distinct-element4510/1)