/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
      
        while(head!=null){
           ListNode next = head.next;
           head.next = prev;
           prev = head;
           head = next;


        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null){
            return ;
        }
        ListNode middle = middle(head);
        ListNode second = middle.next;
        middle.next = null;
        second = reverse(second);
        ListNode curr = head;
        while(second!=null){
            ListNode temp1 = curr.next;
            ListNode temp2 = second.next;
            curr.next = second;
            second.next = temp1;
            second = temp2;
            curr = temp1;
           
        }



        
    }
}
