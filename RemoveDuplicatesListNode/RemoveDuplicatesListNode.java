

public class RemoveDuplicatesListNode {
    public class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy=new ListNode(head.val);
        ListNode ans=dummy;

        ListNode ptr=head.next;

        while(ptr!=null){
            if(ptr.val!=dummy.val){
                dummy.next=ptr;
                dummy=dummy.next;
            }
            ptr=ptr.next;
        }
        dummy.next=null;

        return ans;
        
    }
    public static void main(String[] args) {
        RemoveDuplicatesListNode obj = new RemoveDuplicatesListNode();
        ListNode list = obj.new ListNode(1);
        list.next = obj.new ListNode(1);
        list.next.next = obj.new ListNode(2);
        list.next.next.next = obj.new ListNode(3);
        list.next.next.next.next = obj.new ListNode(3);

        ListNode ans = obj.deleteDuplicates(list);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    
}
