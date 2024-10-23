import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ZiggyLevelOrder {
    class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }

        List<Integer> currAns = new ArrayList<>();
        Stack<TreeNode> main = new Stack<>();
         Stack<TreeNode> helper = new Stack<>();
         int level = 0 ;
         main.push(root);
         while(main.size()>0){
             TreeNode currNode = main.pop();
             currAns.add(currNode.val);
             if(level == 0 ){
                 if(currNode.left !=null){
                     helper.push(currNode.left);
                 }

                 if(currNode.right !=null){
                     helper.push(currNode.right);
                 }
             }else{
                if(currNode.right !=null){
                     helper.push(currNode.right);
                 }
                 if(currNode.left !=null){
                     helper.push(currNode.left);
                 }

             }

             if(main.size()==0){
                 ans.add(currAns);
                 currAns = new ArrayList<>();
                 level = 1-level ;

                main = helper ;
                helper = new Stack<>();
             }
         }
         return ans ;
    }
}
public static void main(String[] args) {
        System.out.println("ZiggyLevelOrder");
        ZiggyLevelOrder ziggyLevelOrder = new ZiggyLevelOrder();
        ZiggyLevelOrder.Solution solution = ziggyLevelOrder.new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ans = solution.zigzagLevelOrder(root);
        for(List<Integer> list : ans){
            for(Integer i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
}
    
}
