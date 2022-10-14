class Solution {
    public ListNode deleteMiddle(ListNode head) {
      if(head.next==null)
        return null;
      
      ListNode fast=head;
      ListNode slow=head;
      ListNode prev=null;
      while(fast.next!=null && fast!=null)
      {
        fast=fast.next.next;
        prev=slow;
        slow=slow.next;
        }
      prev.next=prev.next.next;
      return head;
      
    }

}
      
