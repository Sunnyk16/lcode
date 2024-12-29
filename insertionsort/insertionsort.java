
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class insertionsort {
    
    
        public ListNode insertionSortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode dummy = new ListNode(head.val, head);
            ListNode pre = dummy, cur = head;
            while (cur != null) {
                if (pre.val <= cur.val) {
                    pre = cur;
                    cur = cur.next;
                    continue;
                }
                ListNode p = dummy;
                while (p.next.val <= cur.val) {
                    p = p.next;
                }
                ListNode t = cur.next;
                cur.next = p.next;
                p.next = cur;
                pre.next = t;
                cur = t;
            }
            return dummy.next;
        }
        public static void main(String[] args) {
            insertionsort solution = new insertionsort();
            ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
            ListNode result = solution.insertionSortList(head);
            while (result != null) {
                System.out.println(result.val);
                result = result.next;
            }
        }
    
}
