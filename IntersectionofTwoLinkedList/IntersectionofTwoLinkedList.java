// package IntersectionofTwoLinkedList;

public class IntersectionofTwoLinkedList {
    public int sizeLL(ListNode head) {
        int count = 0;
        ListNode ptr = head;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null ){
            return null;
        }

        int size1= sizeLL(headA);
        int size2= sizeLL(headB);

        int diff=size1 -size2;

        ListNode ptr1=headA;
        ListNode ptr2=headB;
        
        if(diff>0){
            while(diff>0){
                ptr1=ptr1.next;
                diff--;
            }
        }
        else{
            while(diff<0){
                ptr2=ptr2.next;
                diff++;
            }
            
        }

        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr1;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        IntersectionofTwoLinkedList obj = new IntersectionofTwoLinkedList();
        ListNode headA = obj.new ListNode(4);
        headA.next = obj.new ListNode(1);
        headA.next.next = obj.new ListNode(8);
        headA.next.next.next = obj.new ListNode(4);
        headA.next.next.next.next = obj.new ListNode(5);

        ListNode headB = obj.new ListNode(5);
        headB.next = obj.new ListNode(0);
        headB.next.next = obj.new ListNode(1);
        headB.next.next.next = headA.next.next;

        ListNode result = obj.getIntersectionNode(headA, headB);
        System.out.println("Intersection Node: " + result.val);
    }
    
}
