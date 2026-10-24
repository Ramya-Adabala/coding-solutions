# type-of-array4605

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:09:27.207Z  

```java
class Solution {
    int typeOfArr(int arr[]) {
        // code here
        
    int n = arr.length;
             int min = 0, max = 0;

             for(int i=0;i<n;i++){
                 if(arr[max] < arr[i])max = i;
                 if(arr[min] > arr[i])min = i;
             }

             if(min == 0 && max == n-1) return 1;
             if(min == n-1 && max == 0) return 2;
             if(min > max) return 4;
             if(max > min) return 3;

             return 0;
}}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/type-of-array4605/1)