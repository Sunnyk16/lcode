public class MaxArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // Example input
        
        int max = -1;   // First maximum
        int smax = -1;  // Second maximum

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;  // Update smax to previous max
                max = nums[i];  // Update max to current number
            } else if (nums[i] > smax) {
                smax = nums[i];  // Update smax if the current number is greater than smax
            }
        }

        int ans = (max - 1) * (smax - 1);  // Compute the product
        System.out.println(ans); // Print the result
    }
}
