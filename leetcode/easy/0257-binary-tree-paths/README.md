# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 72.25%)  
**Memory:** 49.9 MB (beats 28.93%)  
**Submitted:** 2026-09-22T13:03:51.989Z  

```java
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        //Append the current node's value to the path.
        path += node.val;

        //If it's a leaf node, add the path to the result list.
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";// Separate nodes in the path.
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)