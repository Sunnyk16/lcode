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
public class DiameterOfTree {

    int dia=0;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        dia =Math.max(lh+rh,dia);

        return Math.max(lh,rh)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;


        }

        int h=height(root);
        return dia;
    }

    public static void main(String[] args) {
        // Example usage of diameterOfBinaryTree method
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterOfTree tree = new DiameterOfTree();
        int diameter = tree.diameterOfBinaryTree(root);
        System.out.println(diameter);
    }
    
}
