public class majaorityElement {
    
        public int majorityElement(int[] nums) {
            int cnt = 0, m = 0;
            for (int x : nums) {
                if (cnt == 0) {
                    m = x;
                    cnt = 1;
                } else {
                    cnt += m == x ? 1 : -1;
                }
            }
            return m;
        }

    public static void main(String[] args) {
        majaorityElement me = new majaorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(me.majorityElement(nums));
        int[] nums2 = {3, 3, 4, 2,2, 4, 4, 2, 4};
        System.out.println(me.majorityElement(nums2));

    }
}
