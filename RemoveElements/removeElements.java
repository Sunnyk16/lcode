// package RemoveElements;

public class removeElements {
    
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int x : nums) {
                if (x != val) {
                    nums[k++] = x;
                }
            }
            return k;
        }

        public static void main(String[] args) {
            // Example usage of removeElement method
            int[] nums = {3,2,2,3};
            int val = 3;
            removeElements sol = new removeElements();
            int ans = sol.removeElement(nums, val);
            System.out.println(ans);
        }
    }
    

