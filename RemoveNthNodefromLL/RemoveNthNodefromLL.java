// package RemoveNthNodefromLL;

public class RemoveNthNodefromLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(n>0){
            fast=fast.next;
            n--;
        }
        if(fast ==null){
            return head.next;
        }


        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;


        
    }
    public static void main(String[] args) {
        RemoveNthNodefromLL obj = new RemoveNthNodefromLL();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(6);
        int n = 2;
        ListNode result = obj.removeNthFromEnd(head, n);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        

    }
    
}
