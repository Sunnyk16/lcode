// package AverageSalary;

public class Averagesalary {
    
        public double average(int[] salary) {
            int max = salary[0];
            int min = salary[0];
            int sum = salary[0];
    
            for(int i=1;i<salary.length;i++){
    
                if(max<salary[i]){
                    max=salary[i];
                }
    
                if(min>salary[i]){
                    min=salary[i];
                }
    
                sum = sum + salary[i];
            }
    
            sum = sum - min - max ;
            // System.out.println(sum);
    
            double ans = (double)sum/(salary.length-2);
            return ans ;
        
    }
    public static void main(String[] args) {
        Averagesalary obj = new Averagesalary();
        int[] salary = { 4000,3000,1000,2000 ,5000,6000};
        System.out.println(obj.average(salary));
    }
    
}
