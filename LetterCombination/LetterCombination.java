// package LetterCombination;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        ans.add("");
        String[] d = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        for (char i : digits.toCharArray()) {
            String s = d[i - '2'];
            List<String> t = new ArrayList<>();
            for (String a : ans) {
                for (String b : s.split("")) {
                    t.add(a + b);
                }
            }
            ans = t;
        }
        return ans;

    }

    public static void main(String[] args) {
        LetterCombination lc = new LetterCombination();
        String digits = "23";
        System.out.println(lc.letterCombinations(digits));
    }

}
