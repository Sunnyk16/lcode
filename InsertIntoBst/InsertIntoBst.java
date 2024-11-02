// package InsertIntoBst;
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

public class InsertIntoBst {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root== null){
            TreeNode ans=new TreeNode(val);
            return ans;
        }

        if(root.val>val){
            root.left =  insertIntoBST(root.left,val);
        }
        else{
            root.right = insertIntoBST(root.right,val);
        }



        return root;
        
    }

    public static void main(String[] args) {
        InsertIntoBst obj = new InsertIntoBst();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode result = obj.insertIntoBST(root, 5);
        System.out.println(result.right.left.val);
    }
    
}
