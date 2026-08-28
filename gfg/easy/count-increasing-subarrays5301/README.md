# Count Increasing Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** of integers, return the number of subarrays in arr[] which are strictly increasing with size greater or equal to  **2**. A subarray is a contiguous part of array. A subarray is strictly increasing if each element is greater then it's previous element if it exists.

 **Examples:** 

```
Input: arr[] = [1, 4, 5, 3, 7, 9]
Output: 6
Explanation: The strictly increasing subarrays are: [1, 4], [1, 4, 5], [4, 5], [3, 7], [3, 7, 9], [7, 9]
```

```
Input: arr[] = [1, 3, 3, 2, 3, 5]
Output: 4
Explanation: Increasing Subarrays of size greater or equal to 2 are : {1, 3}, {2, 3}, {2, 3, 5}, {3, 5}. So answer for this test case is 4.
```

```
Input: arr[] = [2, 2, 2, 2]
Output: 0
Explanation: No strictly increasing subarray exists.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 107

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T10:59:05.704Z  

```java
class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int l=0,count=0,prev=arr[0];
        for(int i=1;i<arr.length;i++){
            l=i;
            while(l<arr.length&& prev<arr[l]){
                count++;
                prev=arr[l];
                l++;
            }
            prev=arr[i];
        }
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-increasing-subarrays5301/1)