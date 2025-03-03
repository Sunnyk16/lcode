// package MissingNumber;

public class missingNumber {
    public int missingNumber(int[] nums){

        int n = nums.length;
        int sum = n*(n+1)/2;
        int sumNums = 0;
        for(int num : nums){
            sumNums += num;
        }
        return sum - sumNums;
    }
    
    public static void main(String[] args) {
        int[] nums = {3,0,2};
        missingNumber mn = new missingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
