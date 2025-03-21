// package DeletemiddleLL;

public class DeletemiddleLL {
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null){
            return null;
        }

        ListNode slow=head;
        ListNode fast =head;
        ListNode pre=slow;

        while(fast!=null && fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        pre.next=pre.next.next;
        return head;
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        DeletemiddleLL obj = new DeletemiddleLL();
        ListNode res = obj.deleteMiddle(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
    
}
