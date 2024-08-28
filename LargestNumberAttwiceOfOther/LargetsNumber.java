

public class LargetsNumber {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;

        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                smax = max;
                max=nums[i];
                maxIdx = i;
            }
            else if(smax<nums[i]){
                smax=nums[i];
            }

        }

        if(smax*2 <= max){
            return maxIdx;
        }
        else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        LargetsNumber ln = new LargetsNumber();
        System.out.println(ln.dominantIndex(nums));
    }
    
}
