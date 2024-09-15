
import java.util.Collections;
import java.util.PriorityQueue;

// package LastStoneweight;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        

        while(pq.size()>1){
            int max=pq.remove();
            int smax=pq.remove();
            int nstone =max-smax;

            if(nstone!=0){
                pq.add(nstone);
            }
        }

        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }
         
        
    }
    public static void main(String[] args) {
        LastStoneWeight lsw = new LastStoneWeight();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lsw.lastStoneWeight(stones));
    }
    
}
