public class Gastation {
    
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int i = n - 1, j = n - 1;
            int cnt = 0, s = 0;
            while (cnt < n) {
                s += gas[j] - cost[j];
                ++cnt;
                j = (j + 1) % n;
                while (s < 0 && cnt < n) {
                    --i;
                    s += gas[i] - cost[i];
                    ++cnt;
                }
            }
            return s < 0 ? -1 : i;
        }
        public static void main(String[] args) {
            int[] gas = {1,2,3,4,5,6};
            int[] cost = {3,4,5,1,2,6};
            Gastation obj = new Gastation();
            System.out.println(obj.canCompleteCircuit(gas, cost));
        }
    
    
}
