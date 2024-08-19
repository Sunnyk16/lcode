public class Tribonacci {

    public int tribonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            int firstnumber=0;
            int secondnumber=1;
            int thirdnumber=1;

            for(int i=3;i<=n;i++){
                int fourthnumber=firstnumber+secondnumber+thirdnumber;
                firstnumber=secondnumber;
                secondnumber=thirdnumber;
                thirdnumber=fourthnumber;
            }
            return firstnumber;

        }
    }

    public static void main(String[] args) {
        Tribonacci obj = new Tribonacci();
        System.out.println(obj.tribonacci(5));
    }
}