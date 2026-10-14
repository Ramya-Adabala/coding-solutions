# Extra in One of the Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have given two sorted arrays  **a[]**  &  **b[]**  of distinct elements. The first array has one element extra added in between. Return the index of the extra element.

 **Note** : 0-based indexing is followed.

 **Examples** 

```
Input: a[] = [2,4,6,8,9,10,12], b[] = [2,4,6,8,10,12]
Output: 4
Explanation: In the first array, 9 is extra added and it's index is 4.
```

```
Input: a[] = [3,5,7,8,11,13], b[] = [3,5,7,11,13]
Output: 3
Explanation: In the first array, 8 is extra and it's index is 3.
```

```
Input: a[] = [3,5], b[] = [3]
Output: 1
Explanation: In the first array, 5 is extra and it's index is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T04:40:58.658Z  

```java
/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j])
            i++;j++;
            
        }
        return i;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1)