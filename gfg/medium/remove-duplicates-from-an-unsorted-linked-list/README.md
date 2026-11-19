# remove-duplicates-from-an-unsorted-linked-list

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:33:12.548Z  

```java
/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;
        if (head == null) {
        return null;
        }
        while (temp!= null) {
        if (set.contains(temp.data)) {
          prev.next = temp.next;
        }
        else {
            set.add(temp.data);
            prev=temp;

        }
        temp = temp.next;
        }
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1)