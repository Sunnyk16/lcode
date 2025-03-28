public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int rsum=0;
        for(int ele: nums){
            rsum+=ele;
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        PivotIndex pi = new PivotIndex();
        int[] nums = {1,7,3,2,6,5,6,7,8,9};
        System.out.println(pi.pivotIndex(nums));
    }
    
}

