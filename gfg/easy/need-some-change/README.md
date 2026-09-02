# Swap Adjacent in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of positive integers, swap the ith element with the (i + 2)th element for every valid i, starting from i = 0 and moving from left to right. Return the resulting array. A swap is possible only when the (i + 2)th element exists.

 **Examples :** 

```
Input: arr[] = [1, 2, 3]
Output: [3, 2, 1]
Explanation: Swapping 1 and 3, makes the array [3, 2, 1]. There is only one swap possible in this array.
```

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: [3, 4, 5, 2, 1]
Explanation: Swapping 1 and 3, makes the array [3, 2, 1, 4, 5]. Now, swapping 2 and 4, makes the array [3, 4, 1, 2, 5]. Again,swapping 1 and 5, makes the array [3, 4, 5, 2, 1].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T12:34:08.620Z  

```java
class Solution {
    public void swapElements(int[] arr) {
        // Code here
       
        for(int i=0;i + 2 < arr.length;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
           
        }
        //System.out.println(arr);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/need-some-change/1)