class Solution {
    public int getLength(ListNode head)
    {
        int i;
        ListNode curr = head;

        for(i = 0; curr != null; curr = curr.next, i++);
        return i;
    }
    public ListNode rotateRight(ListNode head, int k)
    {
        ListNode slow = head, prev = null, fast = head;

        int n = getLength(head);

        if(n != 0 && k != 0)
        k = k % n;

        if(head == null || k == 0 ) return head;
       
        for(int i = 1; i < k&& fast != null; i++, fast = fast.next);

       while(fast.next != null)
       {
           prev = slow;
           slow = slow.next;
           fast = fast.next;
       }
       fast.next = head;
       prev.next = null;
       head = slow;
       return head;
    }
}