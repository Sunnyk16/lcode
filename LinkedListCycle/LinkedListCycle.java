

public class LinkedListCycle{
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null ){
            return false;
        }
        
        ListNode slow =head;
        ListNode fast =head;

        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                return true;
            }

        }

        return false;

        
    }
    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        ListNode head = list.new ListNode(3);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(0);
        head.next.next.next = list.new ListNode(-4);
        head.next.next.next.next = head.next; 

        System.out.println("Does the linked list have a cycle? " + list.hasCycle(head));
    }
    
}