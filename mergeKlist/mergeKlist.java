
import java.util.PriorityQueue;

public class mergeKlist {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        else if(lists.length==1){
            return lists[0];
        }

        PriorityQueue <ListNode> pq=new PriorityQueue <> ((a,b)->a.val-b.val);
        

        for(int i=0;i<lists.length;i++){
            ListNode temph=lists[i];

            while(temph!=null){
                pq.add(temph);
                temph=temph.next;
            }
        }


        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        while(pq.size()>0){
            ListNode node =pq.remove();
            dummy.next=node;
            dummy=dummy.next;

        }
        dummy.next=null;

        return ans.next;
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);
        lists[2].next.next = new ListNode(7);
        lists[2].next.next.next = new ListNode(8);
        lists[2].next.next.next.next = new ListNode(9);
        lists[2].next.next.next.next.next = new ListNode(10);
        mergeKlist obj = new mergeKlist();
        ListNode res = obj.mergeKLists(lists);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
    
}
