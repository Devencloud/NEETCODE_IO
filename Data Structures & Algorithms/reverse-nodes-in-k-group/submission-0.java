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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode curr = head;
        int n = 0;
        while(curr!=null){
            n++;
            curr = curr.next;

        }
        curr = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode groupPrev = dummy;
        
        
        
        while(n>=k){
            ListNode groupStart = curr;
            ListNode prev = null;
           
            for(int i = 0;i<k;i++){
                ListNode  temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                
            }
            groupPrev.next = prev;
            groupStart.next = curr;
            groupPrev= groupStart;
            
            n-=k;




        }
        return dummy.next;
        
    }
   
}
