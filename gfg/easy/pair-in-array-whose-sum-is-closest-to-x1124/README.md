# Closest Pair Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a number  **target**, find a pair of elements (a, b) in  **arr[],** where a ≤ b whose sum is closest to  **target.** 

 **Note:** Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

 **Examples:** 

```
Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.

```

```
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
```

```
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T14:48:10.781Z  

```java
class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(arr.length == 1)
            return res;
        Arrays.sort(arr);
        int left = 0 , right = arr.length - 1;
        int min = Integer.MAX_VALUE, a = 0, b = 0;
        while(left < right){
            int diff = Math.abs(arr[left] + arr[right] - target) ;
            if(diff < min){
                a = arr[left];
                b = arr[right];
                min = diff;
            }
            if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        res.add(a);
        res.add(b);
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1)