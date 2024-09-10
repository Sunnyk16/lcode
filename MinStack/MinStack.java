import java.util.Stack;

class MinStack {
    private final Stack<Integer> st;
    private final Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (st.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int ele1 = st.pop();
        int ele2 = min.peek();

        if (ele1 == ele2) {
            min.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return st.peek();
    }

    public int getMin() {
        if (min.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
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
            System.out.println(obj.getMin());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
