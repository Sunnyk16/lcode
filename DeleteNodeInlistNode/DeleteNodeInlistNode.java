public class DeleteNodeInlistNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;  // Prevent null pointer exception by checking if next node exists
        }
        node.val = node.next.val;   // Copy the value of the next node
        node.next = node.next.next; // Bypass the next node
    }

    public static void main(String[] args) {
        DeleteNodeInlistNode obj = new DeleteNodeInlistNode();
        
        // Create a small list to test
        ListNode node = obj.new ListNode(5);
        ListNode nextNode = obj.new ListNode(10);
        node.next = nextNode;

        obj.deleteNode(node); // Deleting node 5, expecting list to become: 10

        // Print the list to verify the deletion
        ListNode current = node;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
