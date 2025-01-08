class altiutde{
    
        public int largestAltitude(int[] gain) {
            int ans = 0, h = 0;
            for (int v : gain) {
                h += v;
                ans = Math.max(ans, h);
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] gain = {-5,1,6,0,-7};
            System.out.println(largestAltitude(gain));
        }
    
}