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

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;
        
    }

    public static void main(String[] args) {
        // Example usage of invertTree method
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertBinaryTree tree = new invertBinaryTree();
        TreeNode invertedRoot = tree.invertTree(root);

        // Print the inverted tree (in-order traversal)
        printInOrder(invertedRoot);
        }

        // Helper method to print the tree in-order
        public static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
        }
    }
    
}
