// // package longestparanthesis;

// public class longestparanthesis {
//     class Solution {
//         public int longestValidParentheses(String s) {
//             int n = s.length();
//             int[] f = new int[n + 1];
//             int ans = 0;
//             for (int i = 2; i <= n; ++i) {
//                 if (s.charAt(i - 1) == ')') {
//                     if (s.charAt(i - 2) == '(') {
//                         f[i] = f[i - 2] + 2;
//                     } else {
//                         int j = i - f[i - 1] - 1;
//                         if (j > 0 && s.charAt(j - 1) == '(') {
//                             f[i] = f[i - 1] + 2 + f[j - 1];
//                         }
//                     }
//                     ans = Math.max(ans, f[i]);
//                 }
//             }
//             return ans;
//         }
//     }
//     public static void main(String[] args) {
//         longestparanthesis lp = new longestparanthesis();
//         Solution s = lp.new Solution();
//         String str = ")()())";
//         System.out.println(s.longestValidParentheses(str));
//     }
    
    
// }

import java.util.Stack;

class Solution_stack {
    public int longestValidParentheses(String s) {
        Stack<Integer> sk = new Stack<>();
        int start = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { // Corrected the comparison
                sk.push(i);
            } else {
                if (sk.isEmpty()) { // Use sk.isEmpty() instead of sk.empty()
                    start = i + 1;
                } else {
                    sk.pop();
                    result = Math.max(result, sk.isEmpty() ? i - start : i - sk.peek());
                }
            }
        }
        return result;
    }
}
