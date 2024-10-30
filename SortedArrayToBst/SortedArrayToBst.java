// package SortedArrayToBst;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SortedArrayToBst {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);

    }

    public TreeNode helper(int[] nums, int start, int end) {
        if (start > end){
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        // Example usage of sortedArrayToBST method
        int[] nums = {-10, -3, 0, 5, 9};
        SortedArrayToBst tree = new SortedArrayToBst();
        TreeNode root = tree.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
    
}
