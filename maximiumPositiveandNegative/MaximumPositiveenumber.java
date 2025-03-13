// package maximiumPositiveandNegative;

public class MaximumPositiveenumber {
    
    
        public int maximumCount(int[] nums) {
            int lastnegIndex= lastNegative(nums) +1 ;
            int firtposIndex = nums.length - firstPositive(nums);
            return Math.max(lastnegIndex , firtposIndex);
        }
    
        public int lastNegative(int[] nums){
            int start = 0 ;
            int end = nums.length-1 ;
            int ans = -1 ;
    
            while(start<=end){
                int mid = (start + end)/2;
                if(nums[mid]<0){
                    ans = mid ;
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }
    
            return ans ;
        }
    
        public int firstPositive(int[] nums){
            int start = 0 ;
            int end = nums.length-1;
            int ans = nums.length;
    
            while(start<=end){
                int mid = (start + end )/2;
                if(nums[mid]>0){
                    ans=mid;
                    end=mid-1;
                }else{
                    start = mid+1 ;
                }
            }
    
            return ans ;
        }

    public static void main(String[] args) {
        MaximumPositiveenumber obj = new MaximumPositiveenumber();
        int[] nums = { -1,-2,-3,2,4,5,6,7,8,9 };
        System.out.println(obj.maximumCount(nums));
    }
    
}
