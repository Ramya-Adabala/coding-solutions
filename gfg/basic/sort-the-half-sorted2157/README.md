# Sort the Two Parts  Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array.
 **Note** : The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size n-k where 0 ≤ k ≤ n), where n is the length of array.

 **Examples:** 

```
Input: arr[] = {2 3 8 -1 7 10}
Output: [-1, 2, 3, 7, 8, 10] 
Explanation: {2 3 8} and {-1 7 10} are sorted in the original array. The overall sorted version is {-1 2 3 7 8 10}
```

```
Input: arr[] = {-4 6 9 -1 3}
Output: [-4, -1, 3, 6, 9]
Explanation: {-4 -1} and {3 6 9} are sorted in the original array. The overall sorted version is {-4 -1 3 6 9}
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
-105≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:32:06.479Z  

```java
class Solution {
    public void sortHalves(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-half-sorted2157/1)