import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    
    public String largestNumber(int[] nums) {
        List<String> vs = new ArrayList<>();
        for (int v : nums) {
            vs.add(v + "");
        }
        vs.sort((a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(vs.get(0))) {
            return "0";
        }
        return String.join("", vs);
    
}

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        System.out.println(ln.largestNumber(new int[]{10, 2}));
        System.out.println(ln.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }
}
