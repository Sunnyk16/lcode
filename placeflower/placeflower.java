import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class placeflower {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ans = new ArrayList<>();
      final int maxCandy = Arrays.stream(candies).max().getAsInt();
  
      for (final int candy : candies)
        ans.add(candy + extraCandies >= maxCandy);
  
      return ans;
    }
    public static void main(String[] args) {
        placeflower solution = new placeflower();
        int[] candies = {2, 3, 5, 1, 3,1};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
    
  }