// package DoubleNumberLinkedList;

public class DoubleNumberLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseLl(ListNode head){
        ListNode curr=head;
        ListNode pre=null;

        while(curr!=null){
            ListNode temp= curr.next;
            curr.next=pre;
            pre=curr;
            curr= temp;
        }
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode nhead =reverseLl(head);

        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        int carry=0;

        while(nhead!=null){
            int sum =nhead.val+nhead.val+carry;
             int d=sum%10;
              carry=sum/10;

             ListNode temp=new ListNode(d);
             dummy.next=temp;
             dummy=dummy.next;
             nhead=nhead.next;

        }

        if(carry>0){
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
        }

        ans=reverseLl(ans.next);
        return ans;
        
    }
    public static void main(String[] args) {
        DoubleNumberLinkedList obj = new DoubleNumberLinkedList();
        ListNode list1 = obj.new ListNode(2);
        list1.next = obj.new ListNode(4);
        list1.next.next = obj.new ListNode(3);
        ListNode ans = obj.doubleIt(list1);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    
}
