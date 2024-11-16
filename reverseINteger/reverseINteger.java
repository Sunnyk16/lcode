public class reverseINteger {
    
        public int reverse(int x) {
            int ans = 0;
            for (; x != 0; x /= 10) {
                if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                    return 0;
                }
                ans = ans * 10 + x % 10;
            }
            return ans;
        }
        public static void main(String[] args) {
            // Example usage of reverse method
            int x = 123;
            reverseINteger sol = new reverseINteger();
            int ans = sol.reverse(x);
            System.out.println(ans);
        }
    
    
}
