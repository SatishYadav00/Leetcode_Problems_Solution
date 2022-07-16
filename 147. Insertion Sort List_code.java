class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode head1=head;
        ListNode head2=head;
        while(head1.next!=null){
            while(head2!=head1.next){
                if(head2.val>head1.next.val){
                    head2.val=head2.val+head1.next.val;
                        head1.next.val=head2.val-head1.next.val;
                    head2.val=head2.val-head1.next.val;
                }
                 head2=head2.next;
            }
            head2=head;
            head1=head1.next;
           
        }
        return head;
    }
}
