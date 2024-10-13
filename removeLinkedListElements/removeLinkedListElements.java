// package removeLinkedListElements;

public class removeLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode dummy =new ListNode(-1);
        dummy.next=head;

        ListNode curr =dummy;

        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return dummy.next;
        
    }
    public static void main(String[] args) {
        removeLinkedListElements r = new removeLinkedListElements();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        ListNode result = r.removeElements(head, val);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    
}
