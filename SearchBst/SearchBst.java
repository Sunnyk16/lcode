// package SearchBst;



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

public class SearchBst {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp=root;

        while(temp!=null){
            if(temp.val == val){
                break;
            }
            else if(temp.val > val){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }

        return temp;
        
    }

    public static void main(String[] args) {
        SearchBst obj = new SearchBst();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode result = obj.searchBST(root, 2);
        System.out.println(result.val);
    }

    
}
