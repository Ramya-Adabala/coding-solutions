# Queue Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a Queue  **q[]**  containing integer elements, traverse the queue and return all its elements in an array.

 **Examples:** 

```
Input : q[] = [3, 4, 2, 2, 4]
Output : 3 4 2 2 4 
```

```
Input : q[] = [3, 2, 2, 7]
Output : 3 2 2 7 
```

 **Constraints:** 
1 ≤ q.size() ≤ 105
1 ≤ elements of Queue ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:30:57.287Z  

```java
class Solution {
    public ArrayList<Integer> queueTraversal(Queue<Integer> q) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int n:q) al.add(n);
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/queue-traversal-1594111322/1)