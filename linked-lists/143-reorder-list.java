/**
* Definition for singly-linked list.
* public class ListNode {
* int val;
* ListNode next;
* ListNode() {}
* ListNode(int val) { this.val = val; }
* ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
class Solution {
public void reorderList(ListNode head) {
ListNode fast = head;
ListNode slow = head;
ListNode prev = null;
ListNode nextnode = null;

while (fast != null && fast.next != null && fast.next.next != null){
slow = slow.next;
fast = fast.next.next;
}

//Reverse
ListNode tail = slow.next;
slow.next = null;
while (tail != null){
nextnode = tail.next;
tail.next = prev;
prev = tail;
tail = nextnode;
}

ListNode current = head;
ListNode temp1 = null;
ListNode temp2 = null;
//Merge
while(prev != null){
temp1 = current.next;
temp2 = prev.next;
current.next = prev;
prev.next = temp1;
current = temp1;
prev = temp2;
}
}
}
