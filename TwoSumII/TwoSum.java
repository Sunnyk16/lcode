

public class TwoSum {

    public int[] twoSum(int[] nums, int target){

        int [] ans = new int [2];
        
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int sum =nums[start]+ nums[end];

            if(sum==target){
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;

            }
            else if(sum >target){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] ans = ts.twoSum(nums, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
