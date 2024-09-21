public class StringCompress {
    class Solution {
        public int compress(char[] chars) {
            int n = chars.length;
            int index = 0; // To track the position where we'll place compressed characters
            int i = 0;
    
            while (i < n) {
                char currentChar = chars[i];
                int count = 0;
    
                // Count occurrences of the current character
                while (i < n && chars[i] == currentChar) {
                    i++;
                    count++;
                }
    
                // Place the current character
                chars[index++] = currentChar;
    
                // If count is greater than 1, convert it to string and append the digits
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
            }
    
            return index;  // The length of the compressed list
        }
    }
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        Solution s = sc.new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(s.compress(chars));
    }    
    
}
