class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            
            ListNode a=dummy;
            ListNode b=dummy;
            
            for(int i=1; i<=n+1 ;i++)
            {
                    a=a.next;
            }
            
            while(a != null){
                    b=b.next;
                    a=a.next ;
            }
            
            b.next=b.next.next;
            
            return dummy.next;
    }
}
