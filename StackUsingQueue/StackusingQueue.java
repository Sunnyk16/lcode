// package StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {
    
    
    private final Queue<Integer> main;
    private final Queue<Integer> helper;

    public StackusingQueue() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
    //   moving all elements from main to helper
        while(!main.isEmpty()){
          helper.add(main.remove());
        }
    //   add x in main queue

        main.add(x);
    //   moving all elements from helper to main

        while(!helper.isEmpty()){
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
        return main.isEmpty();
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



