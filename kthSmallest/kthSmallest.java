// import javax.swing.tree.TreeNode;
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


public class kthSmallest {
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;

    }

    public void helper(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        helper(root.left, k);
        count = count + 1;
        if (count == k) {
            ans = root.val;
        }
        helper(root.right,k);

    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        kthSmallest finder = new kthSmallest();
        int k = 2;
        int result = finder.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is " + result);

    }
    
}
