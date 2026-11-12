# inorder-traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T03:33:09.766Z  

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
              in(root,ans);
              return ans;
    }
    static void in(Node root,ArrayList<Integer> ans){
            if(root==null){
                return;
            }
            in(root.left,ans);
            ans.add(root.data);
            in(root.right,ans);
        }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inorder-traversal/1)