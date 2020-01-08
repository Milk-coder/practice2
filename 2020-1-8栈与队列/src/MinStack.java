import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x) {
        if(minStack.isEmpty()||x<= minStack.peek()){
            minStack.push(x);
        }
        stack.push(x);
    }
    public void pop() {//注意包装类是引用，需要比较内容
        int ret = stack.peek();
        //自动拆箱
        if(ret == minStack.peek()){  //if(stack.peek().equals(minStack.peek()))
            minStack.pop();
        }
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
