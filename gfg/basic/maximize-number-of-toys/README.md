# Maximize Number of Toys

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer array  **arr[]** that denotes the prices of n different toys. You are also given an amount k that is the total money you have. You need to maximize the number of toys you can have with the k amount.

 **Examples:** 

```
Input: arr[] = [5, 4, 3, 2, 1], k = 8
Output: 3
Explanation: With k = 8 amount, you can purchase toys with prices 3 2 1 so total of 3 toys.

```

```
Input: arr[] = [1, 2, 3, 4, 5], k = 15
Output: 5
Explanation: With k = 15 amount, you can purchase all the toys.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 104
1 ≤ k ≤ 104
1 ≤ arri ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:22:28.209Z  

```java
class Solution {
    public static int maxToys(int arr[], int k) {
        // code here
        int n=arr.length;
        int sum=0,count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<=k)
            count++;
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximize-number-of-toys/1)