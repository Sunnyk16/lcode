// package SwapPairs;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class swapPairs {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0, head);
            ListNode pre = dummy;
            ListNode cur = head;
            while (cur != null && cur.next != null) {
                ListNode t = cur.next;
                cur.next = t.next;
                t.next = cur;
                pre.next = t;
                pre = cur;
                cur = cur.next;
            }
            return dummy.next;
        }
        public static void main(String[] args) {
            swapPairs sp = new swapPairs();
            Solution sl = sp.new Solution();
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(3);
            ListNode l4 = new ListNode(4);
            l1.next = l2;
            l2.next = l3;
            l3.next = l4;
            ListNode res = sl.swapPairs(l1);
            while (res != null) {
                System.out.println(res.val);
                res = res.next;
            }
        }
    
}
