
public class WaterBottles {
    public int numwaterBottle(int numBottle,int numExchange){
        int ans = numBottle;

        while(numBottle >= numExchange){

            int newbottle =numBottle/numExchange;
            int remBottle =numBottle%numExchange;

            ans = ans + newbottle;
            numBottle= newbottle + remBottle;
        }
        return ans; 

    }

    public static void main(String[] args) {
        WaterBottles obj = new WaterBottles();
        System.out.println(obj.numwaterBottle(9,3));
    }
    
}
