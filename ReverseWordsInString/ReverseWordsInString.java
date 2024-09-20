// package ReverseWordsInString;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i =arr.length-1;i>=0;i--){
            sb.append(arr[i]);

        }

        String ans =sb.toString();
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        ReverseWordsInString rws = new ReverseWordsInString();
        String s = "the sky is blue";
        System.out.println(rws.reverseWords(s));
    }
}
