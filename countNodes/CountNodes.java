class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class CountNodes {
    
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftAns=countNodes(root.left);
        int rightAns=countNodes(root.right);

        return leftAns+rightAns+1;
        
    }

    public static void main(String[] args) {
        CountNodes countNodes = new CountNodes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(countNodes.countNodes(root));
    }
    
}
