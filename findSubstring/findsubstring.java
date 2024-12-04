import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findsubstring {
    
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String w : words) {
            cnt.merge(w, 1, Integer::sum);
        }
        int m = s.length(), n = words.length;
        int k = words[0].length();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            Map<String, Integer> cnt1 = new HashMap<>();
            int l = i, r = i;
            int t = 0;
            while (r + k <= m) {
                String w = s.substring(r, r + k);
                r += k;
                if (!cnt.containsKey(w)) {
                    cnt1.clear();
                    l = r;
                    t = 0;
                    continue;
                }
                cnt1.merge(w, 1, Integer::sum);
                ++t;
                while (cnt1.get(w) > cnt.get(w)) {
                    String remove = s.substring(l, l + k);
                    l += k;
                    cnt1.merge(remove, -1, Integer::sum);
                    --t;
                }
                if (t == n) {
                    ans.add(l);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        findsubstring fs = new findsubstring();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> res = fs.findSubstring(s, words);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
