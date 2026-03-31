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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
    
      int interval = 1;
      while(interval<lists.length){
        for(int i = 0;i+interval<lists.length;i = i+interval*2){
            lists[i] = merge(lists[i],lists[i+interval]);
        }
        interval = interval*2;
      }
      return lists[0];
    
        
    }
    public ListNode merge(ListNode head1, ListNode head2){
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                
                curr.next= head1;
                
                head1 = head1.next;
            }
            else{
                curr.next= head2;
                
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head1!=null){
            curr.next = head1;
        }
        else{
            curr.next = head2;
        }
        return dummy.next;
    }
}