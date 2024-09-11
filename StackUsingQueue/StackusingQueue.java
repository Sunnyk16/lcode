// package StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;
import javax.management.QueryExp;

public class StackusingQueue {
    
    
    private  Queue<Integer> main;
    private Queue<Integer> helper;
    

    public StackusingQueue() {
        main  = new LinkedList<>();
        helper = new LinkedList<>();

    }

    public void push(int x) {
        //   moving all elements from main to helper
        while(main.size()!=0){
            helper.add(main.remove());
        }
        
        //   add x in main queue
        main.add(x);
        
        //   moving all elements from helper to main
        while(helper.size()!=0){
            main.add(helper.remove());
        }
        
    }

    public int pop() {
        return main.remove();

        
    }

    public int top() {  
        return main.peek();
        
    }

    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        StackusingQueue obj = new StackusingQueue();
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        try {
            System.out.println(obj.top());
        } catch (Exception e) {
            System.out.println("Stack is empty");
        } 
    }
}



