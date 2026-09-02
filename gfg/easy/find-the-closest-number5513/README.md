# Closest in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  of positive integers. The task is to find the closest value in the array to the given number  **k**. The array may contain duplicate values.

 **Note** : If the difference with k is the same for two values in the array return the greater value.

 **Examples :** 

```
Input:  arr[] = [1, 3, 6, 7], k = 4
Output: 3
Explanation: We have array arr={1, 3, 6, 7} and target is 4. If we look at the absolute difference of target with every element of the array we will get { |1-4|, |3-4|, |6-4|, |7-4| }  = {3, 1, 2, 3}. So, the closest number is 3.

```

```
Input: arr[] = [1, 2, 3, 5, 6, 8, 9], k = 4
Output: 5
Explanation: The absolute difference of 4 is 1 from both 3 and 5. According to the question, we have to return greater value, which is 5.

```

```
Input: arr[] = [6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19], k = 10
Output: 11
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ k ≤ 109
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T12:31:57.986Z  

```java
class Solution {
    public static int findClosest(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

      
        if (low >= arr.length) return arr[arr.length - 1];
        if (low == 0) return arr[0];

 
        int diff1 = Math.abs(k - arr[low - 1]);
        int diff2 = Math.abs(k - arr[low]);

        
        return (diff2 <= diff1) ? arr[low] : arr[low - 1];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-closest-number5513/1)