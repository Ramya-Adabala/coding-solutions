# Sum Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, construct its  **Sum**   **Triangle**  as follows:

- The bottom row of the triangle is the original array.
- Each element in the row above is formed by adding the two adjacent elements directly below it.
- Continue this process until only one element remains at the top of the triangle.

Return all elements of the Sum Triangle in **top-to-bottom**  order, and within each row from  **left to right**.

 **Examples:** 

```
Input: arr[] = [4, 7, 3, 6, 7]
Output: [81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7]
Explanation:
       81
     40  41
   21  19  22
 11  10   9   13
4   7   3   6    7
The triangle is constructed from bottom to top by summing adjacent elements:
[4, 7, 3, 6, 7]
[11, 10, 9, 13]
[21, 19, 22]
[40, 41]
[81]
Reading the triangle from top to bottom and left to right gives: [81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7]
```

```
Input: arr[] = [1, 2, 4]
Output: [9, 3, 6, 1, 2, 4] 
Explanation:
   9
 3   6
1  2  4
Reading the triangle from top to bottom and left to right gives: [9, 3, 6, 1, 2, 4] 
```

**Constraints:
**1 ≤ arr.size() ≤ 25
1 ≤ arr[i] ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:53:17.571Z  

```java
class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        // code here
    ArrayList<Integer> ans=new ArrayList();
     ArrayList<Integer> ans1=new ArrayList();
    for(int i=0;i<arr.length;i++){
        ans.add(arr[i]);
        ans1.add(arr[i]);
    }
    while(ans.size()>0){
        int size=ans.size();
     for(int i=0;i<size-1;i++){
         ans.add(ans.get(i)+ans.get(i+1));
     }
      ans.subList(0,size).clear();
       ans1.addAll(0,ans);
    }
    return ans1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-triangle-for-given-array1159/1)