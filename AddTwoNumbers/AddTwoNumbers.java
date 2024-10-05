// package AddTwoNumbers;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }

        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        int carry =0;
        ListNode ptr1=l1;
        ListNode ptr2=l2;

    while(ptr1!= null || ptr2!=null){
        int val1= ptr1!=null ? ptr1.val :0;
        int val2= ptr2!=null ? ptr2.val :0;

        int sum = val1+val2+carry;

        int d=sum%10;
        carry =sum/10;

        ListNode temp=new ListNode(d);
        dummy.next=temp;
        dummy=dummy.next;

        ptr1=ptr1 !=null ?ptr1.next :null;
        ptr2=ptr2 !=null ?ptr2.next :null;


    }

    if(carry>0){
        ListNode temp=new ListNode(carry);
        dummy.next=temp;
        dummy=dummy.next;

    }


    
        return ans.next;
    }
    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode list1 = obj.new ListNode(2);
        list1.next = obj.new ListNode(4);
        list1.next.next = obj.new ListNode(3);
        ListNode list2 = obj.new ListNode(5);
        list2.next = obj.new ListNode(6);
        list2.next.next = obj.new ListNode(4);
        ListNode ans = obj.addTwoNumbers(list1, list2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    
}
