# Linked List Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an LinkedList  **list**  that contains integer elements. The task is to iterate through the given list and print its elements.

 **Examples:** 

```
Input: list = [1, 2, 3, 4]
Output: 1 2 3 4
Explanation: Simply iterate through the ll and print the elements.
```

```
Input: list = [3, 2, 1]
Output: 3 2 1 
Explanation: Simply iterate through the ll and print the elements.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:20:32.835Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    void printList(Node head) {
        // code here
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
            
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linkedlist-traversal/1)