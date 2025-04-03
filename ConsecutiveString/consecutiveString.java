// package ConsecutiveString;

public class consecutiveString {
    public int maxPower(String s) {
        int max= 1;
        int count =1;
         for(int i =1;i< s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);

            if(curr == prev){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
         }
         max=Math.max(max,count);
         return max;
        
    }
    public static void main(String[] args) {
        consecutiveString cs = new consecutiveString();
        String s ="apple";
        System.out.println(cs.maxPower(s));
    }
    
}
