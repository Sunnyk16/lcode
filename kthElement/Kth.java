// package kthElement;

import java.util.PriorityQueue;

public class Kth {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
 
        for(int i=0;i<nums.length;i++){
 
            if(pq.size()<k){
                pq.add(nums[i]);
            }else if ( pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }
 
        return pq.peek();
     } 
    public static void main(String[] args) {
        Kth obj = new Kth();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(obj.findKthLargest(nums, k));
    }
}
