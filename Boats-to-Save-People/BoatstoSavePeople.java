
import java.util.Arrays;

// package Boats-to-Save-People;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        
        int start = 0;
        int end = people.length-1;
        int count=0;

        while(start<=end){
            if(people[start]+people[end]<=limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            count++;
        }
        return count;
        
    }
    public static void main(String[] args){
        BoatstoSavePeople bsp = new BoatstoSavePeople();
        int[] people = {3,2,1,1};
        int limit = 3;
        System.out.println(bsp.numRescueBoats(people, limit));
    }
    
}
