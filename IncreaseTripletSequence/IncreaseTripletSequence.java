// package IncreaseTripletSequence;

public class IncreaseTripletSequence {
    
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        

        for (int i = 0; i < nums.length; i++) {

            int ele = nums[i];

            if (ele <= first) {
                first = ele;
            } 
             else if (ele <= second) {
                second = ele;

            } else {
                third = ele;

                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        IncreaseTripletSequence obj = new IncreaseTripletSequence();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(obj.increasingTriplet(nums));
    }
    
}