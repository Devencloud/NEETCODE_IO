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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry = 0;
      ListNode curr1 = l1;
      ListNode curr2 = l2;
      ListNode dummy = new ListNode(-1);
      ListNode curr = dummy;
      while(curr1!=null && curr2!=null){
         int sum = carry+curr1.val+curr2.val;
         int digit = sum%10;
         ListNode n = new ListNode(digit);
         curr.next = n;
         curr =n;
         carry = sum/10;
         curr1 = curr1.next;
         curr2 = curr2.next;

      }
      while(curr1!=null){
         int sum = carry+curr1.val;
         int digit = sum%10;
         ListNode n = new ListNode(digit);
         curr.next = n;
         curr =n;
         carry = sum/10;
         curr1 = curr1.next;
         

      }
      while(curr2!=null){
         int sum = carry+curr2.val;
         int digit = sum%10;
         ListNode n = new ListNode(digit);
         curr.next = n;
         curr =n;
         carry = sum/10;
         
         curr2 = curr2.next;
      }
      while(carry!=0){
         int sum = carry;
         int digit = sum%10;
         ListNode n = new ListNode(digit);
         curr.next = n;
         curr = n;
         carry = sum/10;
      }
      return dummy.next;
        
    }
}
