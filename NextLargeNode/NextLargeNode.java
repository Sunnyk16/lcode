// package NextLargeNode;

import java.util.Stack;

public class NextLargeNode {
    public static class  ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int sizeLL(ListNode head) {
        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next=pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode nHead = reverseLL(head);

        Stack<Integer> st = new Stack<>();

        st.push(nHead.val);

        ListNode curr = nHead.next;
        int ptr = size - 2;

        while (ptr >= 0) {
            int ele = curr.val;
            curr = curr.next;

            while (st.size() > 0 && st.peek() <= ele) {
                st.pop();

            }

            if (st.size() == 0) {
                arr[ptr] = 0;
            } else {
                arr[ptr] = st.peek();
            }

            st.push(ele);
            ptr--;

        }
        return arr;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        NextLargeNode obj = new NextLargeNode();
        int[] res = obj.nextLargerNodes(head);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
}
