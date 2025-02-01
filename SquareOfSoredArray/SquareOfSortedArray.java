// package SquareOfSoredArray;

public class SquareOfSortedArray {

    public int[] squareArray(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while (start <= end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }

            ptr--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 2, 10 };
        SquareOfSortedArray sosa = new SquareOfSortedArray();
        int[] ans = sosa.squareArray(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
