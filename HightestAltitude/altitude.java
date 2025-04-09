class altitude{
    
        public int largestAltitude(int[] gain) {
            int ans = 0, h = 0;
            for (int v : gain) {
                h += v;
                ans = Math.max(ans, h);
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] gain = {-5,1,4,0,-6,-7};
            altitude obj = new altitude();
            System.out.println(obj.largestAltitude(gain));
        }
        
    
}