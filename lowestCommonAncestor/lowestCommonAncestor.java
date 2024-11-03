// package lowestCommonAncestor;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val; 
        this.left = left; 
        this.right = right;
    }
}

public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }

        TreeNode temp=root;

        while(temp!=null){
            if(temp.val>p.val && temp.val>q.val){
                temp=temp.left;
            }
            else if(temp.val<p.val && temp.val<q.val){
                temp=temp.right;

            }
            else{
                break;
            }

        }
        return temp;
        
    }
    public static void main(String[] args) {
        lowestCommonAncestor obj = new lowestCommonAncestor();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode result = obj.lowestCommonAncestor(root, root.left, root.left.right);
        System.out.println(result.val);
    }
    
}
