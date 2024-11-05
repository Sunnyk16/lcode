
public class sortedListTobst {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { 
            this.val = x; 
            this.left = null;
            this.right = null;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public ListNode middleNode(ListNode head){
            if(head == null){
                return null;
            }
    
            ListNode fast = head ;
            ListNode slow = head ;
            ListNode pre = slow ;
    
            while(fast!=null && fast.next!=null){
                 pre = slow ;
                 slow = slow.next;
                 fast = fast.next.next ;
             }
                pre.next = null;
             return slow ;
        }
        public TreeNode sortedListToBST(ListNode head) {
            if(head == null){
                return null;
            }else if ( head.next == null){
                TreeNode root = new TreeNode(head.val);
                return root ;
            }
    
            ListNode mid = middleNode(head);
            TreeNode root = new TreeNode(mid.val);
            root.left = sortedListToBST(head) ;
            root.right = sortedListToBST(mid.next);
    
            return root ;
        }
        public static void main(String[] args) {
            sortedListTobst obj = new sortedListTobst();
            ListNode head = obj.new ListNode(-10);
            head.next = obj.new ListNode(-3);
            head.next.next = obj.new ListNode(0);
            head.next.next.next = obj.new ListNode(5);
            head.next.next.next.next = obj.new ListNode(9);
    
            TreeNode result = obj.new Solution().sortedListToBST(head);
            System.out.println(result);
        }
    }
    
}
