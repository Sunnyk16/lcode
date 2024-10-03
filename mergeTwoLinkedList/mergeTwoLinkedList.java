// package mergeTwoLinkedList;

public class mergeTwoLinkedList {
    
        public class ListNode {
            int val;
            ListNode next;
            
            ListNode(int val) {
                this.val = val;
            }
        }
    
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode ans = dummy;
    
            ListNode ptr1 = list1;
            ListNode ptr2 = list2;
    
            while (ptr1 != null && ptr2 != null) {
                if (ptr1.val < ptr2.val) {
                    dummy.next = ptr1;
                    ptr1 = ptr1.next;
                } else {
                    dummy.next = ptr2;
                    ptr2 = ptr2.next;
                }
                dummy = dummy.next;
            }
    
            if (ptr1 == null) {
                dummy.next = ptr2;
            } else {
                dummy.next = ptr1;
            }
    
            return ans.next;
        }
    
        public static void main(String[] args) {
            mergeTwoLinkedList obj = new mergeTwoLinkedList();
            ListNode list1 = obj.new ListNode(1);
            ListNode list2 = obj.new ListNode(1);
            list1.next = obj.new ListNode(2);
            list1.next.next = obj.new ListNode(4);
            list1.next.next.next = obj.new ListNode(5);
    
            list2.next = obj.new ListNode(3);
            list2.next.next = obj.new ListNode(6);
            list2.next.next.next = obj.new ListNode(8);
    
            ListNode ans = obj.mergeTwoLists(list1, list2);
            while (ans != null) {
                System.out.println(ans.val);
                ans = ans.next;
            }
        }
    
    
    
}
