# Search in Rotated Array 2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted and rotated array  **arr[]**  and a target  **key**. Check whether the key is present in the array or not.

 **Note:**  The array may contains duplicate elements.

 **Examples:** 

```
Input: arr[] = [3, 3, 3, 1, 2, 3], key = 3
Output: true
Explanation: 3 is present in the array.
```

```
Input: arr[] = [4, 5, 8, 1, 1, 1, 2], key = 6
Output: false
Explanation: 6 is not present in the array.
```

 **Constraints** :
1 ≤ arr.size() ≤ 106
0 ≤ arr[i], key ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T14:14:39.559Z  

```java
class Solution {
    public boolean search(int[] a, int key) {
        // code here
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]== key) return true;
            if(a[l]==a[m] && a[m]==a[h]) {
                l++;h--;
            }
            else if(a[l]<=a[m]) {
                if(a[l]<=key && key<a[m])
                h=m-1;
                else l=m+1;
            }
            else{
                if(a[m]<key && key<=a[h])
                l=m+1;
                else h=m-1;
            }
        }
        return false;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1)