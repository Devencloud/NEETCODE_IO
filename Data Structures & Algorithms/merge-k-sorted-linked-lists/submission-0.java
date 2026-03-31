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
        ListNode curr1 = head1;
        ListNode curr2=  head2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                
                curr.next= new ListNode(curr1.val);;
                
                curr1 = curr1.next;
            }
            else{
                curr.next= new ListNode(curr2.val);
                
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        if(curr1!=null){
            curr.next = curr1;
        }
        else{
            curr.next = curr2;
        }
        return dummy.next;
    }
}
