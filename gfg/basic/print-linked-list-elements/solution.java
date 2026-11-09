/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        Node temp=head;
     ArrayList<Integer> al=new ArrayList<>();
     if(head==null) return al;
     while(head!=null){
         al.add(head.data);
         head=head.next;
     }
     return al;
    }
}