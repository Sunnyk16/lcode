
// package QueueAsStack;

import java.util.Stack;

public class QueueAsStack {
    private final Stack<Integer> main;
    private final Stack<Integer> helper;
    

    public QueueAsStack() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }

        main.push(x);

        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }

    }

    public int pop() {
        return main.pop();

    }

    public int peek() {
        return main.peek();

    }

    public boolean empty() {
        return main.isEmpty();
    }
    public static void main(String[] args) {
        QueueAsStack obj = new QueueAsStack();
        obj.push(3);
        obj.push(2);
        obj.push(4);
        obj.push(1);
        obj.push(5);
        obj.push(6);
        obj.pop();
        obj.pop();
    }
    
}
