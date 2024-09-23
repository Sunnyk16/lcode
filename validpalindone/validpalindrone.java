// package validpalindone;

public class validpalindrone {
    public boolean isPalindrome(String s) {
        
        if(s.length()==1){
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }



        int start=0;
        int end =sb.length() - 1;

        while(start<end){
            int sChar=sb.charAt(start);
            int eChar=sb.charAt(end);

            if(sChar != eChar){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
    

    public static void main(String[] args) {
        validpalindrone vp = new validpalindrone();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(vp.isPalindrome(s));
    
}
}
