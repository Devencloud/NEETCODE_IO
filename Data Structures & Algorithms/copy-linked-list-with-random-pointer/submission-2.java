/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        while(curr!=null){
            Node n1 = new Node(curr.val);
            Node temp = curr.next;
            curr.next = n1;
            n1.next = temp;
            curr = temp;
        }
        curr = head;
        while(curr!=null && curr.next!=null){
           
            if(curr.random!=null){
                curr.next.random = curr.random.next;

            }
            curr = curr.next.next;
        }
        Node dummy=  new Node(-1);
        curr = head;
        Node copyCurr = dummy;

        while(curr!=null){
            Node copy = curr.next;
           
            copyCurr.next = copy;
            copyCurr = copy;
            curr.next = copy.next;
            curr = curr.next;


           
            
            

        }
        return dummy.next;
    }
}
