class Solution {
    public ListNode partition(ListNode head, int x) {
            ListNode less=new ListNode(0);
            ListNode high=new ListNode(0);
            
            ListNode smallhead=less;
            ListNode highhead=high;
            while(head != null)
            {
                    if (head.val < x)
                    {
                            smallhead.next=head;
                            smallhead=smallhead.next;
                    }
                    else
                    {
                            highhead.next=head;
                            highhead=highhead.next;
                    }
                    head=head.next;
                            
            }
            highhead.next=null;
            smallhead.next=high.next;
            
            return less.next;
        
    }
}
