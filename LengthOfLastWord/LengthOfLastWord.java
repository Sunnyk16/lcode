public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count =0;
         for(int i =s.length()-1;i>=0;i--){
            char ch=s.charAt(i);

            if(ch!=' '){
                count++;
            }
            else if(count!=0){
                break;
            }
         }
         return count;
        
    }
    public static void main(String[] args){
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "Hello World";
        System.out.println(lolw.lengthOfLastWord(s));
    }
    
}
