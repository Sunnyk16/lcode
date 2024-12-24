

public class mergeAlternate {
    

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {
            if (i < m) {
                ans.append(word1.charAt(i));
            }
            if (i < n) {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        mergeAlternate ma = new mergeAlternate();
        System.out.println(ma.mergeAlternately(word1, word2));
    }

    

    // public String mergeAlternately(String word1, String word2) {
    //     int m = word1.length(), n = word2.length();
    //     StringBuilder ans = new StringBuilder();
    //     for (int i = 0; i < m || i < n; ++i) {
    //         if (i < m) {
    //             ans.append(word1.charAt(i));
    //         }
    //         if (i < n) {
    //             ans.append(word2.charAt(i));
    //         }
    //     }
    //     return ans.toString();
    // }

    // public static void main(String[] args) {
    //     String word1 = "abc", word2 = "pqr";
    //     mergeAlternate ma = new mergeAlternate();
    //     System.out.println(ma.mergeAlternately(word1, word2));
    // }
    
}
