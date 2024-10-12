public class linkedListcycleII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {  // Cycle detected
                while (ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return ptr;  // The node where the cycle begins
            }
        }

        return null;  // No cycle detected
    }

    public static void main(String[] args) {
        linkedListcycleII list = new linkedListcycleII();

        // Create nodes for the list
        ListNode head = list.new ListNode(3);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(0);
        head.next.next.next = list.new ListNode(-4);

        // Create a cycle: last node (-4) points back to the node with value 2
        head.next.next.next.next = head.next;

        // Detect the cycle
        ListNode cycleNode = list.detectCycle(head);
        if (cycleNode != null) {
            System.out.println("The node where the cycle begins is: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
