// package FirstAndLastElement;

public class FirstAndlastElement {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, -1};
            if(nums.length==0){
                return ans ;
            }
            ans[0] = firstOccurence(nums,target);
            ans[1] = lastOccurence(nums,target);
            return ans ;
        }
    
        public int firstOccurence(int[] nums , int target){
            int start = 0 ;
            int end = nums.length-1;
            int ans = -1 ;
    
            while(start<=end){
                int mid = (start + end )/2;
                if(nums[mid]==target){
                    ans = mid ;
                    end = mid-1;
                }else if ( target > nums[mid]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }
            return ans ;
        }
    
        public int lastOccurence(int[] nums , int target){
            int start = 0 ;
            int end = nums.length-1;
            int ans = -1 ;
    
            while(start<=end){
                int mid = (start + end )/2;
                if(nums[mid]==target){
                    ans = mid ;
                   start = mid+1 ;
                }else if ( target > nums[mid]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }
            return ans ;
        }
        public static void main(String[] args) {
            FirstAndlastElement obj = new FirstAndlastElement();
            int[] nums = {5,7,7,8,8,10};
            int target = 8;
            int[] ans = obj.searchRange(nums, target);
            System.out.println(ans[0]+" "+ans[1]);
        }
    }
    

