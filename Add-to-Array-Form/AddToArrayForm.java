import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while(p>=0 || k>0){
            int numval =0; // if p is greater than 0 then get the value of num[p] else 0

            if(p>=0){
                numval = num[p]; // get the value of num[p]

            }

            int d = k%10; // last digit from k

            int sum = numval + d + carry; // sum of last digit of num and k and carry 

            int digit = sum%10; // last digit of sum

            carry =sum/10; // carry for next iteration

            ans.add(digit); // add last digit to ans

            p--; // move to next digit of num

            k  = k/10; // remove last digit from k




             
        }
        if(carry>0){
            ans.add(carry); // if carry is left add it to ans
        }
        Collections.reverse(ans); //revesing the array to get the correct ans
        return ans;
        

    }
    public static void main(String[] args) {
        AddToArrayForm obj = new AddToArrayForm();
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> result = obj.addToArrayForm(num, k);
        System.out.println("Result: " + result);
    }
}