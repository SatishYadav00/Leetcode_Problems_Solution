class Solution {
    public ListNode rotateRight(ListNode head, int k) {
           
            if(head == null || k==0)
            {
                    return head;
               }
            
            ListNode tail=head;
            int n=0;
            
            while(tail.next != null)
            {
                    n++;
                    tail=tail.next;
            }
            n++;
            tail.next=head;
            
            int breakPoint=n-k%n+1;
            while(breakPoint > 1)
            {
                    tail=tail.next;
                    breakPoint--;
            }
            head=tail.next;
            tail.next=null;
            return head;
        
    }
}
