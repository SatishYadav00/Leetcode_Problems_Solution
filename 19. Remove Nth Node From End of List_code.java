class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
            ListNode temp=new ListNode(0);
            temp.next=head;
            
            ListNode a=temp;
            ListNode b=temp;
            
            for(int i=1; i<=n+1 ;i++)
            {
                    a=a.next;
            }
            
            while(a != null){
                    b=b.next;
                    a=a.next ;
            }
            
            b.next=b.next.next;
            
            return temp.next;
    }
}
