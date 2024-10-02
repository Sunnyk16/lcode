// package isPalindroneLinkedLIst;

import java.util.Stack;

public class IspalindroneLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();

        ListNode ptr=head;
        while(ptr!=null){
            st.push(ptr.val);
            ptr=ptr.next;
        }
        
        

        ListNode ptr2=head;
        while(ptr2 !=null){
            int val1 = ptr2.val;
            int val2 = st.pop();
            if(val1 != val2){
                return false;
            }
            ptr2=ptr2.next;
        }

        return true;
    }
    public static void main(String[] args) {
        IspalindroneLinkedList is = new IspalindroneLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(is.isPalindrome(head));
    }
    
}


