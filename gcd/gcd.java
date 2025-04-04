

public class gcd {
    
        public String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            int len = gcd(str1.length(), str2.length());
            return str1.substring(0, len);
        }
    
        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
        public static void main(String[] args) {
            gcd g = new gcd();
            System.out.println(g.gcdOfStrings("ABCABCABC", "ABC"));
        }
    
    
}
