public class DuplicateLL {
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
        ListNode(int val, ListNode next) 
        {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode detectAndRemoveDuplicateNodes(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(head != null)
        {
            if(head.next != null && head.val==head.next.val)
            {
                while(head.next != null && head.val == head.next.val)
                {
                    head = head.next;
                }
                prev.next = head.next;
            }
            else
            {
                prev =prev.next;
            }
            head = head.next;

        }
        return dummy.next;
    
}
}
