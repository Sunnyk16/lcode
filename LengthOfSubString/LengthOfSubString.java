
import java.util.HashSet;

public class LengthOfSubString {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ss = new HashSet<>();

        int i = 0, ans = 0;
        for (int j = 0; j < s.length(); ++j) {
            while (ss.contains(s.charAt(j))) {
                ss.remove(s.charAt(i++));
            }
            ss.add(s.charAt(j));
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        LengthOfSubString l = new LengthOfSubString();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }

}
