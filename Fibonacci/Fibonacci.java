// package Fibonacci;

public class Fibonacci {
    public int fib(int n) {
       if(n==0){
        return 0;
       }
       else if(n==1){
        return 1;
       }
       
       int firstterm=0;
       int secondterm=1;

       for(int i=1;i <= n; i++){
        int thirdterm=firstterm+secondterm;
        firstterm=secondterm;
        secondterm=thirdterm;
       }
        return firstterm;
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fib(5));
    }
}
