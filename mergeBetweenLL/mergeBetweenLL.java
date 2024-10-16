// package mergeBetweenLL;

public class mergeBetweenLL {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode ans =dummy;
        ListNode curr=head.next;
        int sum=0;

        while(curr!=null){
            if(curr.val!=0){

                sum+=curr.val;

            }
            else{
                ListNode temp=new ListNode(sum);
                dummy.next=temp;
                dummy=dummy.next;
                sum=0;

            }
            curr=curr.next;
            
        }
        return ans.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        mergeBetweenLL obj = new mergeBetweenLL();
        ListNode res = obj.mergeNodes(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
    
}
