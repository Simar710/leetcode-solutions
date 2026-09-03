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
public ListNode removeNthFromEnd(ListNode head, int n) {

if (head == null || head.next == null){
return null;
}

ListNode curr = new ListNode(0);
curr.next = head;
ListNode temp = curr;
ListNode temp2 = curr;
int i = 0;

while(i <= n){
temp = temp.next;
i++;
}

while(temp!= null){
temp = temp.next;
temp2 = temp2.next;
}

temp2.next = temp2.next.next;

return curr.next;
}
}
