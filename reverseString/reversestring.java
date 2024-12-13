
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class reversestring {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s = "hello world";
        reversestring rv = new reversestring();
        System.out.println(rv.reverseWords(s));
    }
}