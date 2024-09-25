import java.util.Stack;

public class MinAddToMakePalindrone {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++){

            char ch =s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(st.size()>0 && st.peek()=='('){
                st.pop();
            }
            else{
                count++;
            }
        }

        return st.size() + count ;
        
    }
    public static void main(String[] args) {
        MinAddToMakePalindrone obj = new MinAddToMakePalindrone();
        System.out.println(obj.minAddToMakeValid("())"));
    }
}
