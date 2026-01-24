class Solution 
{
    public ListNode reverseList(ListNode head)
    {
        ListNode curr = head, prev = null, next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        ListNode start = head, end = head, prev = null;

        for(int i = 1; i < left; i++)
        {
            prev = start;
            start = start.next;
        }

        for(int i = 1; i < right; i++)
           end = end.next;
        ListNode  temp = end.next;
        end.next = null;
        ListNode revList = reverseList(start);
        if(prev != null)
           prev.next = revList;
        else head = revList;
        start.next = temp;
        return head;

        
    }
}