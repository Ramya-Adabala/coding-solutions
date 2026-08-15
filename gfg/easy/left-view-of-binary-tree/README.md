# Left View of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **root** of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

 **Note:**  If the tree is empty, return an empty list.

 **Examples :** 

```
Input: root = [1, 2, 3, 4, 5, N, N] 
 
Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

```

```
Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

```

 **Constraints:** 
0 ≤ number of nodes ≤ 105
0 ≤ node -> data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:25:02.252Z  

```java
class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                
               
                if (i == 0) {
                    result.add(curr.data);
                }
                
                if (curr.left != null)
                    queue.offer(curr.left);
                
                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1)