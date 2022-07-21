class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head ==null || head.next==null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode it=dummy;
        ListNode preIt=null;
        for(int i=0;i<left;i++)
        {
            preIt=it;
            it=it.next;
            
        }
        
        ListNode itRev=it;
        ListNode preRev=preIt;
        for(int i=left;i<=right;i++)
        {
            ListNode forwd=itRev.next;
            itRev.next=preRev;
            preRev=itRev;
            itRev=forwd;
        }
        
        //connect
        preIt.next=preRev;
        it.next=itRev;
        return dummy.next;
    }
}
