

public class BulbSwither {
    public int bulbSwitch(int n) {
        int count =0;
        int i=1;

        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        BulbSwither bs = new BulbSwither();
        System.out.println(bs.bulbSwitch(3));
    }
    
}
