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
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp; 
        }
        return prev;
    }
    
    
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode second = mid.next;
        mid.next = null;
        second= reverse(second);
        ListNode curr = head;
        while(second!=null){
            ListNode temp1= curr.next;
            ListNode temp2 = second.next;
            curr.next = second;
            second.next = temp1;
            curr = temp1;
            second =temp2;

            
        }
       



        
    }
}
