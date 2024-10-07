// package OddEvenLinkedList;

public class OddEvenLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode oddEvenList(ListNode head) {
        
        if(head ==null || head.next== null || head.next.next == null){
            return head;
        } 

        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode evenStart=evenHead;

        while(evenHead != null && evenHead.next != null){
            oddHead.next=oddHead.next.next;
            evenHead.next=evenHead.next.next;

            oddHead=oddHead.next;
            evenHead=evenHead.next;
        }

        oddHead.next=evenStart;
        return head;
    }
    public static void main(String[] args) {
        OddEvenLinkedList obj = new OddEvenLinkedList();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);
        head.next.next.next.next.next = obj.new ListNode(6);
        head.next.next.next.next.next.next = obj.new ListNode(7);
        head.next.next.next.next.next.next.next = obj.new ListNode(8);
        head.next.next.next.next.next.next.next.next = obj.new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = obj.new ListNode(10);
        System.out.println("Before Odd Even List");
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
        head = obj.oddEvenList(head);
        System.out.println("\nAfter Odd Even List");
        temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    
    }
    
}
